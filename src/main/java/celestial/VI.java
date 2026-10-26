/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.Vw_1;
import com.google.common.collect.Maps;
import java.util.Map;

public final class VI
extends Enum<VI> {
    public static final /* enum */ VI VERTEX = new VI("vertex", ".vsh", 35633);
    public static final /* enum */ VI FRAGMENT = new VI("fragment", ".fsh", 35632);
    private final String shaderName;
    private final String shaderExtension;
    private final int shaderMode;
    private final Map<String, Vw_1> loadedShaders = Maps.newHashMap();
    private static final /* synthetic */ VI[] $VALUES;

    public Map<String, Vw_1> id_byte() {
        return this.loadedShaders;
    }

    private VI(String string2, String string3, int n2) {
        this.shaderName = string2;
        this.shaderExtension = string3;
        this.shaderMode = n2;
    }

    static {
        $VALUES = VI.id_throws();
    }

    public static VI[] values() {
        return (VI[])$VALUES.clone();
    }

    public static VI valueOf(String string) {
        return Enum.valueOf(VI.class, string);
    }

    public String id_class() {
        return this.shaderName;
    }

    public String id_break() {
        return this.shaderExtension;
    }

    private static /* synthetic */ VI[] id_throws() {
        return new VI[]{VERTEX, FRAGMENT};
    }

    public int id_protected() {
        return this.shaderMode;
    }
}

