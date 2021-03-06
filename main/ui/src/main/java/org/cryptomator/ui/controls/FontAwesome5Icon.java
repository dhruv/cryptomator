package org.cryptomator.ui.controls;

/**
 * Inspired by de.jensd:fontawesomefx-fontawesome
 */
public enum FontAwesome5Icon {
	ANCHOR("\uF13D"), //
	ARROW_UP("\uF062"), //
	CHECK("\uF00C"), //
	COG("\uF013"), //
	COGS("\uF085"), //
	COPY("\uF0C5"), //
	CROWN("\uF521"), //
	EXCLAMATION("\uF12A"), //
	EXCLAMATION_CIRCLE("\uF06A"), //
	EXCLAMATION_TRIANGLE("\uF071"), //
	EYE("\uF06E"), //
	EYE_SLASH("\uF070"), //
	FILE_IMPORT("\uF56F"), //
	FOLDER_OPEN("\uF07C"), //
	HAND_HOLDING_HEART("\uF4BE"), //
	HEART("\uF004"), //
	HDD("\uF0A0"), //
	KEY("\uF084"), //
	LINK("\uF0C1"), //
	LOCK("\uF023"), //
	LOCK_OPEN("\uF3C1"), //
	MAGIC("\uF0D0"), //
	PLUS("\uF067"), //
	PRINT("\uF02F"), //
	QUESTION("\uF128"), //
	SPINNER("\uF110"), //
	SYNC("\uF021"), //
	TIMES("\uF00D"), //
	WRENCH("\uF0AD"), //
	WINDOW_MINIMIZE("\uF2D1"), //
	;

	private final String unicode;

	FontAwesome5Icon(String unicode) {
		this.unicode = unicode;
	}

	public String unicode() {
		return unicode;
	}
}
