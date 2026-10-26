/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package celestial;

import celestial.AW;
import celestial.Az_1;
import celestial.rcd_3;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rqu_3;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Ak_1 {
    @SerializedName(value="serverName")
    public String id_class;
    @SerializedName(value="serverIP")
    public String id_break;
    @SerializedName(value="populationInfo")
    public rgP_2 id_byte;
    @SerializedName(value="serverMOTD")
    public rgP_2 id_protected;
    @SerializedName(value="pingToServer")
    public long id_throws;
    @SerializedName(value="version")
    public int id_case = rqu_3.id_class().getProtocolVersion();
    @SerializedName(value="gameVersion")
    public rgP_2 id_catch = new rgN_2(rqu_3.id_class().getName());
    @SerializedName(value="pinged")
    public boolean id_private;
    @SerializedName(value="playerList")
    public List<rgP_2> id_implements = Collections.emptyList();
    @SerializedName(value="resourceMode")
    private Az_1 id_extends = Az_1.PROMPT;
    @SerializedName(value="categoryType")
    public AW id_finally;
    @SerializedName(value="serverIcon")
    private String id_native;
    @SerializedName(value="lanServer")
    private boolean id_volatile;

    public String id_byte() {
        return this.id_native;
    }

    public Ak_1(String string, String string2, boolean bl) {
        this.id_class = string;
        this.id_break = string2;
        this.id_volatile = bl;
        this.id_finally = AW.DEFAULT;
    }

    public Ak_1(String string, String string2, boolean bl, AW aW) {
        this(string, string2, bl);
        this.id_finally = aW;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Ak_1)) {
            return false;
        }
        Ak_1 ak_1 = (Ak_1)object;
        return Objects.equals(this.id_break, ak_1.id_break);
    }

    public String toString() {
        return "ServerData{serverName='" + this.id_class + "', serverIP='" + this.id_break + "', populationInfo=" + this.id_byte + ", serverMOTD=" + this.id_protected + ", pingToServer=" + this.id_throws + ", version=" + this.id_case + ", gameVersion=" + this.id_catch + ", pinged=" + this.id_private + ", playerList=" + this.id_implements + ", resourceMode=" + this.id_extends + ", categoryType=" + this.id_finally + ", serverIcon='" + this.id_native + "', lanServer=" + this.id_volatile + "}";
    }

    public int hashCode() {
        return Objects.hash(this.id_break);
    }

    public void id_class(Ak_1 ak_1) {
        this.id_break = ak_1.id_break;
        this.id_class = ak_1.id_class;
        this.id_finally = ak_1.id_finally;
        this.id_class(ak_1.id_break());
        this.id_native = ak_1.id_native;
        this.id_volatile = ak_1.id_volatile;
        this.id_byte = ak_1.id_byte;
        this.id_protected = ak_1.id_protected;
        this.id_catch = ak_1.id_catch;
        this.id_case = ak_1.id_case;
        this.id_throws = ak_1.id_throws;
        this.id_implements = ak_1.id_implements;
        this.id_finally = ak_1.id_finally;
        this.id_extends = ak_1.id_extends;
    }

    public rcd_3 id_class() {
        rcd_3 rcd_32 = new rcd_3();
        rcd_32.id_class("name", this.id_class);
        rcd_32.id_class("ip", this.id_break);
        if (this.id_native != null) {
            rcd_32.id_class("icon", this.id_native);
        }
        if (this.id_extends == Az_1.ENABLED) {
            rcd_32.id_class("acceptTextures", true);
        } else if (this.id_extends == Az_1.DISABLED) {
            rcd_32.id_class("acceptTextures", false);
        }
        return rcd_32;
    }

    public void id_class(String string) {
        this.id_native = string;
    }

    public static Ak_1 id_class(rcd_3 rcd_32) {
        Ak_1 ak_1 = new Ak_1(rcd_32.id_native("name"), rcd_32.id_native("ip"), false);
        if (rcd_32.id_byte("icon", 8)) {
            ak_1.id_class(rcd_32.id_native("icon"));
        }
        if (rcd_32.id_byte("acceptTextures", 1)) {
            if (rcd_32.id_new("acceptTextures")) {
                ak_1.id_class(Az_1.ENABLED);
            } else {
                ak_1.id_class(Az_1.DISABLED);
            }
        } else {
            ak_1.id_class(Az_1.PROMPT);
        }
        return ak_1;
    }

    public void id_class(Az_1 az_1) {
        this.id_extends = az_1;
    }

    public Az_1 id_break() {
        return this.id_extends;
    }

    public AW id_throws() {
        return this.id_finally;
    }

    public boolean id_protected() {
        return this.id_volatile;
    }
}

