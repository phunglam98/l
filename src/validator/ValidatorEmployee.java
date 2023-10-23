package validator;

import input.Input;

public class ValidatorEmployee {
    public static int inputId() {
        String regex = "^[0-9]{1}$";
        String id;
        do {
            System.out.println("nhập id 1 chữ so");
            id = Input.inputString();
            if (id.matches(regex)) {
                break;
            }

        } while (true);
        return Integer.parseInt(id);

    }
}
