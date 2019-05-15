import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    RemoveVowels p = new RemoveVowels();


        @Test

        public void places() {
            String[] str1 = {"India","Pakistan","Melbourne","Australia"};
            String[] result = p.removeVowels(str1);
            String[] Expected={"Ind","Pkstn","Mlbrn","Astrl"};
            assertArrayEquals(Expected, result);
        }

        @Test

        public void places1() {
            String str2 = "e";
            String result = p.removeVowels(str2);
            assertEquals("", result);


        }


        @Test

        public void places2() {
            String str3 = "eaou";
            String result = p.removeVowels(str3);
            assertEquals("", result);


        }


        @Test
        public void places3() {
            String str4 = null;
            String result = p.removeNull(str4);
            assertEquals("Input String cannot be null", result);


        }


        @Test
        public void places4() {
            String s = "1";
            String result = p.removeNumeric(s);
            assertEquals("Input String should contain only characters", result);


        }



}

