package org.passwort.frame.passwort;

import java.security.SecureRandom;

public class PasswortCreator {

	public static String Passwort = "";

	public PasswortCreator() {

		String G = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String K = "abcdefghijklmnopqrstuvwxyz";
		String N = "123456789";
		String Null = "0";
		String S = FramePasswortGenerator.textField.getText() + "";
		String FIN = "";
		int length = FramePasswortGenerator.slider.getValue();

		if (FramePasswortGenerator.BoxG.isSelected()) {
			FIN = FIN + G;
		}
		if (FramePasswortGenerator.BoxK.isSelected()) {
			FIN = FIN + K;
		}
		if (FramePasswortGenerator.BoxN.isSelected()) {
			FIN = FIN + N;
		}
		if (FramePasswortGenerator.BoxNull.isSelected()) {
			FIN = FIN + Null;
		}
		if (FramePasswortGenerator.BoxS.isSelected()) {
			FIN = FIN + S;
		}

		if (FramePasswortGenerator.BoxG.isSelected() || FramePasswortGenerator.BoxK.isSelected()
				|| FramePasswortGenerator.BoxN.isSelected() || FramePasswortGenerator.BoxNull.isSelected()
				|| FramePasswortGenerator.BoxS.isSelected()) {

			SecureRandom random = new SecureRandom();
			StringBuilder pass = new StringBuilder(length);
			for (int i = 0; i < length; i++) {
				pass.append(FIN.charAt(random.nextInt(FIN.length())));
			}
			Passwort = pass + "";
			FramePasswortGenerator.PasswortField.setText(pass + "");

		} else {
			FIN = FIN + G + K + N + Null + S;
			SecureRandom random = new SecureRandom();
			StringBuilder pass = new StringBuilder(length);
			for (int i = 0; i < length; i++) {
				pass.append(FIN.charAt(random.nextInt(FIN.length())));
			}
			Passwort = pass + "";
			FramePasswortGenerator.PasswortField.setText(pass + "");
		}

	}

}
