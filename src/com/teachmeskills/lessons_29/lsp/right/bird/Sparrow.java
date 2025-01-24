package com.teachmeskills.lessons_29.lsp.right.bird;

import com.teachmeskills.lessons_29.lsp.right.typeBird.FlyingBird;

public class Sparrow extends FlyingBird {
    @Override
    public void makeSound() {
        System.out.println("Sparrow sing chirp-chirp");
    }
}
