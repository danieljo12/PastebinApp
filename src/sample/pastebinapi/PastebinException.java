package sample.pastebinapi;

import sample.AlertBox;

public class PastebinException extends Exception {

	private static final long serialVersionUID = 1L;

	AlertBox Abox;

	protected PastebinException(String msg) {
		Abox.startAlertBox(msg);
	}
}