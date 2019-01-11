package com.company;


public class StringCharMix {

    static StringBuilder strRes = new StringBuilder();

    public String stringMergeByChar(String strFirst, String strSecond, String strThird) {
        String MESSAGE = "TRY TO ENTER STRINGS OF EQUIVALENT LENGTH";

        int val=1;
        if (strFirst.length() != strSecond.length() && strThird.length() != strSecond.length()) {
            strRes.append(MESSAGE);
        } else {
            if (0!=strFirst.length()) {
                strRes.append(strFirst.charAt(0));
                strRes.append(strSecond.charAt(0));
                strRes.append(strThird.charAt(0));
                return stringMergeByChar(strFirst.substring(val), strSecond.substring(val), strThird.substring(val));
            }
        }

        return strRes.toString();
    }
}

