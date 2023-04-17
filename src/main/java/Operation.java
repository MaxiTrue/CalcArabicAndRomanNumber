abstract class Operation {

    public static final int ERROR = -404;

    public static int calc(String operation, final int numb1, final int numb2) {
        switch (operation) {
            case ("+"):
                return numb1 + numb2;
            case ("-"):
                return numb1 - numb2;
            case ("*"):
                return numb1 * numb2;
            case ("/"):
                return numb1 / numb2;
        }

        return ERROR;
    }
}
