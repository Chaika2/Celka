/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package celestial;

import celestial.Hb_1;
import celestial.MT;
import celestial.ff_3;
import celestial.rqO_2;
import celestial.rrMh_1;
import celestial.rrMx_1;
import celestial.rrbb_3;
import celestial.rrzJ_2;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Properties;
import org.lwjgl.opengl.GL11;

public class rrMJ {
    private String id_byte = null;
    private String id_protected = null;
    public rqO_2 id_class = null;
    private int id_throws = -1;
    private int id_case = 0;
    private int id_catch = 0;
    private int id_private = 0;
    private int id_implements = 0;
    private rrMx_1[] id_finally = null;
    private int id_extends = 0;
    private boolean id_native = false;
    private int id_volatile = 0;
    private ByteBuffer id_final = null;
    public byte[] id_break = null;
    private ByteBuffer id_package = null;
    private boolean id_int = true;
    private boolean id_new = true;

    public int id_byte() {
        return this.id_finally.length;
    }

    public rrMJ(String string, byte[] byArray, String string2, rqO_2 rqO_22, int n, int n2, int n3, int n4, Properties properties) {
        this.id_byte = string;
        this.id_protected = string2;
        this.id_class = rqO_22;
        this.id_case = n;
        this.id_catch = n2;
        this.id_private = n3;
        this.id_implements = n4;
        int n5 = n3 * n4 * 4;
        if (byArray.length % n5 != 0) {
            rrbb_3.id_protected("Invalid animated texture length: " + byArray.length + ", frameWidth: " + n3 + ", frameHeight: " + n4);
        }
        this.id_break = byArray;
        int n6 = byArray.length / n5;
        if (properties.get("tile.0") != null) {
            int n7 = 0;
            while (properties.get("tile." + n7) != null) {
                n6 = n7 + 1;
                ++n7;
            }
        }
        String string3 = (String)properties.get("duration");
        int n8 = Math.max(rrbb_3.id_class(string3, 1), 1);
        this.id_finally = new rrMx_1[n6];
        for (int i = 0; i < this.id_finally.length; ++i) {
            rrMx_1 rrMx_12;
            String string4 = (String)properties.get("tile." + i);
            int n9 = rrbb_3.id_class(string4, i);
            String string5 = (String)properties.get("duration." + i);
            int n10 = Math.max(rrbb_3.id_class(string5, n8), 1);
            this.id_finally[i] = rrMx_12 = new rrMx_1(n9, n10);
        }
        this.id_native = rrbb_3.id_class(properties.getProperty("interpolate"), false);
        this.id_volatile = rrbb_3.id_class(properties.getProperty("skip"), 0);
        if (this.id_native) {
            this.id_final = Hb_1.id_class(n5);
        }
    }

    private int id_class(int n, int n2, double d) {
        return (int)((double)n * (1.0 - d) + (double)n2 * d);
    }

    private void id_class(rrMx_1 rrMx_12, rrMx_1 rrMx_13, double d) {
        int n;
        int n2 = this.id_private * this.id_implements * 4;
        int n3 = n2 * rrMx_12.id_class;
        if (n3 + n2 <= this.id_package.limit() && (n = n2 * rrMx_13.id_class) + n2 <= this.id_package.limit()) {
            ((Buffer)this.id_final).clear();
            for (int i = 0; i < n2; ++i) {
                int n4 = this.id_package.get(n3 + i) & 0xFF;
                int n5 = this.id_package.get(n + i) & 0xFF;
                int n6 = this.id_class(n4, n5, d);
                byte by = (byte)n6;
                this.id_final.put(by);
            }
            ((Buffer)this.id_final).flip();
            MT.id_super(this.id_throws);
            rrzJ_2.id_catch();
            GL11.glTexSubImage2D((int)3553, (int)0, (int)this.id_case, (int)this.id_catch, (int)this.id_private, (int)this.id_implements, (int)6408, (int)5121, (ByteBuffer)this.id_final);
        }
    }

    public boolean id_class() {
        rrMx_1 rrMx_12 = this.id_break();
        if (rrMx_12 == null) {
            return false;
        }
        ++rrMx_12.id_byte;
        if (rrMx_12.id_byte < rrMx_12.id_break) {
            return this.id_native;
        }
        rrMx_12.id_byte = 0;
        ++this.id_extends;
        if (this.id_extends >= this.id_finally.length) {
            this.id_extends = 0;
        }
        return true;
    }

    public rrMx_1 id_class(int n) {
        if (this.id_finally.length <= 0) {
            return null;
        }
        if (n < 0 || n >= this.id_finally.length) {
            n = 0;
        }
        return this.id_finally[n];
    }

    public rrMx_1 id_break() {
        return this.id_class(this.id_extends);
    }

    public String id_throws() {
        return this.id_byte;
    }

    public rqO_2 id_catch() {
        return this.id_class;
    }

    public String id_case() {
        return this.id_protected;
    }

    public void id_protected() {
        if (this.id_new) {
            if (this.id_throws < 0) {
                ff_3 ff_32 = rrzJ_2.id_class(this.id_class);
                if (ff_32 == null) {
                    this.id_new = false;
                    return;
                }
                this.id_throws = ff_32.id_new();
            }
            if (this.id_package == null) {
                this.id_package = Hb_1.id_class(this.id_break.length);
                this.id_package.put(this.id_break);
                ((Buffer)this.id_package).flip();
                this.id_break = null;
            }
            boolean bl = this.id_int = rrMh_1.id_class() ? rrMh_1.id_break(this.id_throws) : true;
            if (this.id_class() && this.id_int) {
                int n;
                int n2 = this.id_private * this.id_implements * 4;
                rrMx_1 rrMx_12 = this.id_break();
                if (rrMx_12 != null && (n = n2 * rrMx_12.id_class) + n2 <= this.id_package.limit()) {
                    if (this.id_native && rrMx_12.id_byte > 0) {
                        if (this.id_volatile <= 1 || rrMx_12.id_byte % this.id_volatile == 0) {
                            rrMx_1 rrMx_13 = this.id_class(this.id_extends + 1);
                            double d = 1.0 * (double)rrMx_12.id_byte / (double)rrMx_12.id_break;
                            this.id_class(rrMx_12, rrMx_13, d);
                        }
                    } else {
                        ((Buffer)this.id_package).position(n);
                        MT.id_super(this.id_throws);
                        rrzJ_2.id_catch();
                        GL11.glTexSubImage2D((int)3553, (int)0, (int)this.id_case, (int)this.id_catch, (int)this.id_private, (int)this.id_implements, (int)6408, (int)5121, (ByteBuffer)this.id_package);
                    }
                }
            }
        }
    }

    public boolean id_private() {
        return this.id_int;
    }
}

