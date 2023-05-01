package com.you;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class TooShortCourseException extends Exception {
	public TooShortCourseException() {
		super("Course duration should not be less than 15 days");
	}
}

class TooLongCourseException extends Exception {
	public TooLongCourseException() {
		super("Course duration should not be more than 30 days");
	}
}

class InvalidDatesException extends Exception {
	public InvalidDatesException() {
		super("Start date must not be after end date");
	}
}

class TooShortAttendanceException extends Exception {
	public TooShortAttendanceException() {
		super("Minimum 75% attendance is required to appear in examination");
	}
}

class TooMuchMedicalLeavesException extends Exception {
	public TooMuchMedicalLeavesException() {
		super("Maximum 20% of total course duration can be taken as medical leave");
	}
}

class ABCVocationalSchool {

	static long getCourseDurationinDays(String startDateText, String endDateText)
			throws InvalidDatesException, TooLongCourseException, TooShortCourseException {
		LocalDate startDate = LocalDate.parse(startDateText, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		LocalDate endDate = LocalDate.parse(endDateText, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		if (startDate.isAfter(endDate)) {
			throw new InvalidDatesException();
		}
		long courseDurationInDays = ChronoUnit.DAYS.between(startDate, endDate.plusDays(1));
		if (courseDurationInDays < 15) {
			throw new TooShortCourseException();
		}
		if (courseDurationInDays > 30) {
			throw new TooLongCourseException();
		}
		return courseDurationInDays;
	}

	static long getMedicalLeavesDurationinDays(String startDateText, String endDateText,
			long courseDurationInDays) throws InvalidDatesException, TooMuchMedicalLeavesException {
		LocalDate startDate = LocalDate.parse(startDateText, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		LocalDate endDate = LocalDate.parse(endDateText, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		if (startDate.isAfter(endDate)) {
			throw new InvalidDatesException();
		}
		long medicalLeavesInDays = ChronoUnit.DAYS.between(startDate, endDate.plusDays(1));
		double medicalLeavePercentage = (double) medicalLeavesInDays / (double) courseDurationInDays;
		if (medicalLeavePercentage > 0.2) {
			throw new TooMuchMedicalLeavesException();
		}
		return medicalLeavesInDays;
	}

	static double getAttendancePercentage(long courseDurationInDays, long medicalLeavesInDays,
			long attendanceInDays) throws TooShortAttendanceException {
		long totalWorkingDays = courseDurationInDays - medicalLeavesInDays;
		double attendancePercentage = (double) attendanceInDays / (double) totalWorkingDays * 100.0;
		if (attendancePercentage < 75.0) {
			throw new TooShortAttendanceException();
		}
		return attendancePercentage;
	}

	static String getRemark(long courseDurationInDays, long medicalLeavesInDays, long attendanceInDays) {
		try {
			double attendancePercentage = getAttendancePercentage(courseDurationInDays,
					medicalLeavesInDays, attendanceInDays);
			System.out.println("Your attendance is " + attendancePercentage + "%");
			if (attendancePercentage >= 95.0) {
				return "You got 10 out of 10 marks in discipline and extracurricular activity";
			} else if (attendancePercentage >= 90.0) {
				return "You got 8 out of 10 marks in discipline";
			} else {
				return "You need to improve your attendance";
			}
		} catch (TooShortAttendanceException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter course start date (dd-MM-yyyy): ");
		String startDateText = scanner.nextLine();

		System.out.print("Enter course end date (dd-MM-yyyy): ");
		String endDateText = scanner.nextLine();

		System.out.print("Enter number of attendance days: ");
		long attendanceInDays = scanner.nextLong();

		System.out.print("Enter number of medical leave days: ");
		long medicalLeavesInDays = scanner.nextLong();

		try {
			long courseDurationInDays = getCourseDurationinDays(startDateText, endDateText);
			double medicalLeavePercentage = (double) medicalLeavesInDays
					/ (double) courseDurationInDays;
			double attendancePercentage = getAttendancePercentage(courseDurationInDays,
					medicalLeavesInDays, attendanceInDays);
			String remark = getRemark(courseDurationInDays, medicalLeavesInDays, attendanceInDays);

			System.out.println("Course duration: " + courseDurationInDays + " days");
			System.out.println("Medical leave percentage: " + medicalLeavePercentage * 100.0 + "%");
			System.out.println("Attendance percentage: " + attendancePercentage + "%");
			System.out.println("Remark: " + remark);
		} catch (DateTimeParseException e) {
			System.out.println("Invalid date format. Use dd-MM-yyyy");
		} catch (InvalidDatesException e) {
			System.out.println("Invalid dates: " + e.getMessage());
		} catch (TooShortCourseException | TooLongCourseException | TooShortAttendanceException x) {
			System.out.println(x.getMessage());
		}
	}
}
