/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rqR_2;
import java.util.Random;
import java.util.UUID;

public class rqG_2 {
    private static final String[] id_class = new String[]{"Slim", "Far", "River", "Silly", "Fat", "Thin", "Fish", "Bat", "Dark", "Oak", "Sly", "Bush", "Zen", "Bark", "Cry", "Slack", "Soup", "Grim", "Hook", "Dirt", "Mud", "Sad", "Hard", "Crook", "Sneak", "Stink", "Weird", "Fire", "Soot", "Soft", "Rough", "Cling", "Scar"};
    private static final String[] id_break = new String[]{"Fox", "Tail", "Jaw", "Whisper", "Twig", "Root", "Finder", "Nose", "Brow", "Blade", "Fry", "Seek", "Wart", "Tooth", "Foot", "Leaf", "Stone", "Fall", "Face", "Tongue", "Voice", "Lip", "Mouth", "Snail", "Toe", "Ear", "Hair", "Beard", "Shirt", "Fist"};

    public static String id_class(UUID uUID) {
        Random random = rqG_2.id_break(uUID);
        return rqG_2.id_class(random, id_class) + rqG_2.id_class(random, id_break);
    }

    private static String id_class(Random random, String[] stringArray) {
        return rqR_2.id_class(stringArray, random);
    }

    private static Random id_break(UUID uUID) {
        return new Random(uUID.hashCode() >> 2);
    }
}

