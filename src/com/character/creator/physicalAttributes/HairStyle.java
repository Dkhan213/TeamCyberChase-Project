package com.character.creator.physicalAttributes;

import java.util.Random;

public enum HairStyle {
        RED,
        BLACK,
        BLONDE,
        BRUNETTE,
        STRAWBERRY_BLONDE,
        BLUE,
        GREEN,
        YELLOW,
        PURPLE,
        WHITE,
        GREY;

        public static HairStyle getRandomHairStyle() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    }
