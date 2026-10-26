/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ko_1;
import celestial.rRO;
import celestial.rRu_1;

public interface rrGs_1 {
    public int id_byte();

    public void id_class(boolean var1);

    default public void id_class(Ko_1 ko_1) {
        ko_1.id_class("Level spawn location", () -> Ko_1.id_class(this.id_class(), this.id_break(), this.id_byte()));
        ko_1.id_class("Level time", () -> String.format("%d game time, %d day time", this.id_throws(), this.id_case()));
    }

    public int id_class();

    public int id_break();

    public long id_throws();

    public rRu_1 id_finally();

    public boolean id_catch();

    public rRO id_extends();

    public long id_case();

    public boolean id_implements();

    public float id_protected();

    public boolean id_private();

    public boolean id_native();
}

