package org.passwort.frame.passwort;

import java.security.SecureRandom;

public class VerificationPasswortGenerator {

	public static String Passwort = "";

	public VerificationPasswortGenerator() {

		String G = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String K = "abcdefghijklmnopqrstuvwxyz";
		String N = "123456789";
		String Null = "0";
		String S = FrameVerificationPasswortGenerator.textField.getText() + "";
		String FIN = "";
		int length = FrameVerificationPasswortGenerator.slider.getValue();

		if (FrameVerificationPasswortGenerator.BoxG.isSelected()) {
			FIN = FIN + G;
		}
		if (FrameVerificationPasswortGenerator.BoxK.isSelected()) {
			FIN = FIN + K;
		}
		if (FrameVerificationPasswortGenerator.BoxN.isSelected()) {
			FIN = FIN + N;
		}
		if (FrameVerificationPasswortGenerator.BoxNull.isSelected()) {
			FIN = FIN + Null;
		}
		if (FrameVerificationPasswortGenerator.BoxS.isSelected()) {
			FIN = FIN + S;
		}

		if (FrameVerificationPasswortGenerator.BoxG.isSelected() || FrameVerificationPasswortGenerator.BoxK.isSelected()
				|| FrameVerificationPasswortGenerator.BoxN.isSelected()
				|| FrameVerificationPasswortGenerator.BoxNull.isSelected()
				|| FrameVerificationPasswortGenerator.BoxS.isSelected()) {
			// tet

			SecureRandom random = new SecureRandom();
			StringBuilder pass = new StringBuilder(length);
			for (int i = 0; i < length; i++) {
				pass.append(FIN.charAt(random.nextInt(FIN.length())));
			}
			Passwort = pass + "";
			FrameVerificationPasswortGenerator.textField_1.setText(pass + "");

		} else {
			FIN = FIN + G + K + N + Null + S;
			SecureRandom random = new SecureRandom();
			StringBuilder pass = new StringBuilder(length);
			for (int i = 0; i < length; i++) {
				pass.append(FIN.charAt(random.nextInt(FIN.length())));
			}
			Passwort = pass + "";
			FrameVerificationPasswortGenerator.textField_1.setText(pass + "");
		}

	}

}
