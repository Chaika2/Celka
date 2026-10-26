/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package celestial;

import com.google.gson.annotations.SerializedName;

public class PG {
    @SerializedName(value="x")
    public int id_class;
    @SerializedName(value="z")
    public int id_break;

    public String toString() {
        return this.id_class + ", " + this.id_break;
    }
}

