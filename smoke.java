package Main;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;
public class smoke {


    @Test
    public void password() {
        int IIN = 010203;
        String password  = "Abc#123";
        assertNotSame( IIN, password);
        System.out.println("Вы ввели данные  правильно");
    }


    @Test
    public void password_2() {

        String IIN = "010203";
        String password  = "Abc#123";
        if(IIN==password){
            System.out.println("Не правильно");
        }
        else{
            assertNotSame(IIN, password);
            System.out.println("Вы ввели данные  правильно");
        }

    }



    @Test
    public void password_3() {
        String IIN = "010101";

        if(IIN.contains("a") ||IIN.contains("b") ||IIN.contains("c") ||IIN.contains("d") ) {
            System.out.println(" Не Правильно");
        }
        if(IIN.contains("0") ||IIN.contains("1") ) {

            System.out.println("Поле ИИН не содержит буквы");
        }


    }
    @Test
    public void password_4() {
        String password  = "Abc#123";

        if(password.contains("a") ||password.contains("b") ||password.contains("c") ||password.contains("d")||password.contains("0") ||password.contains("1")||password.contains("#") ) {
            System.out.println("БЕЗОПАСНО! Поле пароль содержит буквы,цифры и символы");
        }
        else if(password.contains("0") ||password.contains("1") ) {

            System.out.println("НЕБЕЗОПАСНО! Поле пароль содержит только цифры");
        }
        else if(password.contains("a") ||password.contains("b")||password.contains("b") ||password.contains("c") ) {
            {

                System.out.println("НЕБЕЗОПАСНО! Поле пароль содержит только цифры");
            }



        }}}