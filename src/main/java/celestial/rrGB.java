/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ko_1;
import celestial.gi_3;
import celestial.rRl_1;
import celestial.rnW_2;
import celestial.roM_2;
import celestial.rrGS;
import java.util.UUID;

public interface rrGB
extends rrGS {
    public void id_byte(boolean var1);

    public int id_int();

    public roM_2 id_this();

    @Override
    default public void id_class(Ko_1 ko_1) {
        rrGS.super.id_class(ko_1);
        ko_1.id_class("Level name", this::id_volatile);
        ko_1.id_class("Level game mode", () -> String.format("Game mode: %s (ID %d). Hardcore: %b. Cheats: %b", this.id_new().id_break(), this.id_new().id_class(), this.id_implements(), this.id_continue()));
        ko_1.id_class("Level weather", () -> String.format("Rain time: %d (now: %b), thunder time: %d (now: %b)", this.id_int(), this.id_private(), this.id_package(), this.id_catch()));
    }

    public void id_class(rRl_1 var1);

    public void id_class(roM_2 var1);

    public void id_class(long var1);

    public void id_class(UUID var1);

    public void id_break(boolean var1);

    public void id_break(long var1);

    public void id_throws(int var1);

    public void id_catch(int var1);

    public void id_case(int var1);

    public boolean id_continue();

    public gi_3<rnW_2> id_else();

    public rRl_1 id_new();

    public int id_package();

    public int id_return();

    public boolean id_super();

    public void id_protected(int var1);

    public void id_private(int var1);

    public int id_final();

    public String id_volatile();

    public int id_synchronized();
}

