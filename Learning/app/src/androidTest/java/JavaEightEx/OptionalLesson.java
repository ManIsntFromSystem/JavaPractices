package JavaEightEx;


import android.graphics.Path;

import java.util.Optional;

public class OptionalLesson {
    public static void main(String[] args) {
//        Optional<String> optional1 = Optional.empty();
//        Optional<String> optional2 = Optional.ofNullable(null);
//        Optional<String> optionalS = get0();
        Optional<String> optional3 = get0();//если вернет true
        if(optional3.isPresent()){//if be false -> return empty and this code will working
            System.out.println(optional3.get());
        }
    }

    private static Optional<String> get0() {
    if (true){
        Optional.of("Hello");
    }
        return Optional.empty();//to left us from nullPointerException
    }
}
