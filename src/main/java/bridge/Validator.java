package bridge;

import java.util.Objects;
import java.util.regex.Pattern;

public class Validator {
    static final int MIN_SIZE = 3;
    static final int MAX_SIZE = 20;
    static final String UP = "U";
    static final String DOWN = "D";

    private Validator() {}

    /**
    * 입력값이 숫자로 변환이 된다면 변환한 값을 반환하고, 그렇지 않으면 예외를 반환한다.
    * @return int
    * */
    public static int isNumber(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException("[ERROR] 다리 길이는 숫자여야 합니다.");
        }
    }

    /**
     * 입력값이 3 ~ 20 사이가 아니라면 예외를 반환한다.
     * */
    public static void isInRange(int number) {
        if (MIN_SIZE > number || number > MAX_SIZE) {
            throw new IllegalArgumentException("[ERROR] 다리 길이는 3부터 20 사이의 숫자여야 합니다.");
        }
    }

    /**
     * 입력값이 한 문자가 아니라면 예외를 반환한다.
     * */
    public static void isOneString(String input) {
        if (input.length() != 1) {
            throw new IllegalArgumentException("[ERROR] 이동할 칸은 한 문자여야 합니다.");
        }
    }

    /**
    * 입력값이 대문자가 아니라면 예외를 반환한다.
    * */
    public static void isUppercase(String input) {
        if (!Character.isUpperCase(input.charAt(0))) {
            throw new IllegalArgumentException("[ERROR] 이동할 칸은 대문자여야 합니다.");
        }
    }

    /**
     * 입력값이 U 또는 D가 아니라면 예외를 반환한다.
     * */
    public static void isUpOrDown(String input) {
        if (!(input.equals(UP) || input.equals(DOWN))) {
            throw new IllegalArgumentException("[ERROR] 이동할 칸은 U 또는 D여야 합니다.");
        }
    }
}
