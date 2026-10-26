/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.cm_3;
import celestial.rgN_2;
import celestial.rgS_2;
import celestial.rgc_3;
import celestial.rqO_2;
import celestial.rqR_2;
import java.util.Random;

public class rph_3 {
    private static final rqO_2 id_class = new rqO_2("minecraft", "alt");
    private static final rgc_3 id_break = rgc_3.id_class.id_class(id_class);
    private static final rph_3 id_byte = new rph_3();
    private final Random id_protected = new Random();
    private final String[] id_throws = new String[]{"the", "elder", "scrolls", "klaatu", "berata", "niktu", "xyzzy", "bless", "curse", "light", "darkness", "fire", "air", "earth", "water", "hot", "dry", "cold", "wet", "ignite", "snuff", "embiggen", "twist", "shorten", "stretch", "fiddle", "destroy", "imbue", "galvanize", "enchant", "free", "limited", "range", "of", "towards", "inside", "sphere", "cube", "self", "other", "ball", "mental", "physical", "grow", "shrink", "demon", "elemental", "spirit", "animal", "creature", "beast", "humanoid", "undead", "fresh", "stale", "phnglui", "mglwnafh", "cthulhu", "rlyeh", "wgahnagl", "fhtagn", "baguette"};

    private rph_3() {
    }

    public static rph_3 id_class() {
        return id_byte;
    }

    public void id_class(long l) {
        this.id_protected.setSeed(l);
    }

    public rgS_2 id_class(cm_3 cm_32, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = this.id_protected.nextInt(2) + 3;
        for (int i = 0; i < n2; ++i) {
            if (i != 0) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(rqR_2.id_class(this.id_throws, this.id_protected));
        }
        return cm_32.id_break().id_class(new rgN_2(stringBuilder.toString()).id_break(id_break), n, rgc_3.id_class);
    }
}

