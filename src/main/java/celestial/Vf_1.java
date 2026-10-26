/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.system.MemoryUtil
 */
package celestial;

import celestial.MT;
import celestial.VH;
import celestial.Vp_1;
import celestial.rjV_2;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.system.MemoryUtil;

public class Vf_1
extends Vp_1
implements AutoCloseable {
    private static final Logger id_class = LogManager.getLogger();
    private int id_break;
    private final int id_byte;
    private final int id_protected;
    private final IntBuffer id_throws;
    private final FloatBuffer id_case;
    private final String id_catch;
    private boolean id_private;
    private final VH id_implements;

    private void id_byte() {
        this.id_private = true;
        if (this.id_implements != null) {
            this.id_implements.id_break();
        }
    }

    public Vf_1(String string, int n, int n2, VH vH) {
        this.id_catch = string;
        this.id_byte = n2;
        this.id_protected = n;
        this.id_implements = vH;
        if (n <= 3) {
            this.id_throws = MemoryUtil.memAllocInt((int)n2);
            this.id_case = null;
        } else {
            this.id_throws = null;
            this.id_case = MemoryUtil.memAllocFloat((int)n2);
        }
        this.id_break = -1;
        this.id_byte();
    }

    @Override
    public void id_class(float f, float f2, float f3) {
        ((Buffer)this.id_case).position(0);
        this.id_case.put(0, f);
        this.id_case.put(1, f2);
        this.id_case.put(2, f3);
        this.id_byte();
    }

    public static int id_class(int n, CharSequence charSequence) {
        return MT.id_break(n, charSequence);
    }

    @Override
    public void id_class(float f, float f2) {
        ((Buffer)this.id_case).position(0);
        this.id_case.put(0, f);
        this.id_case.put(1, f2);
        this.id_byte();
    }

    @Override
    public void id_class(float f) {
        ((Buffer)this.id_case).position(0);
        this.id_case.put(0, f);
        this.id_byte();
    }

    @Override
    public void id_class(int n, int n2, int n3, int n4) {
        ((Buffer)this.id_throws).position(0);
        if (this.id_protected >= 0) {
            this.id_throws.put(0, n);
        }
        if (this.id_protected >= 1) {
            this.id_throws.put(1, n2);
        }
        if (this.id_protected >= 2) {
            this.id_throws.put(2, n3);
        }
        if (this.id_protected >= 3) {
            this.id_throws.put(3, n4);
        }
        this.id_byte();
    }

    @Override
    public void id_class(float[] fArray) {
        if (fArray.length < this.id_byte) {
            id_class.warn("Uniform.set called with a too-small value array (expected {}, got {}). Ignoring.", (Object)this.id_byte, (Object)fArray.length);
        } else {
            ((Buffer)this.id_case).position(0);
            this.id_case.put(fArray);
            ((Buffer)this.id_case).position(0);
            this.id_byte();
        }
    }

    @Override
    public void id_class(rjV_2 rjV_22) {
        ((Buffer)this.id_case).position(0);
        rjV_22.id_class(this.id_case);
        this.id_byte();
    }

    @Override
    public void id_class(float f, float f2, float f3, float f4) {
        ((Buffer)this.id_case).position(0);
        this.id_case.put(f);
        this.id_case.put(f2);
        this.id_case.put(f3);
        this.id_case.put(f4);
        ((Buffer)this.id_case).flip();
        this.id_byte();
    }

    public static void id_class(int n, int n2) {
        RenderSystem.glUniform1i(n, n2);
    }

    public static int id_class(String string) {
        int n = -1;
        if ("int".equals(string)) {
            n = 0;
        } else if ("float".equals(string)) {
            n = 4;
        } else if (string.startsWith("matrix")) {
            if (string.endsWith("2x2")) {
                n = 8;
            } else if (string.endsWith("3x3")) {
                n = 9;
            } else if (string.endsWith("4x4")) {
                n = 10;
            }
        }
        return n;
    }

    public String id_class() {
        return this.id_catch;
    }

    public void id_class(int n) {
        this.id_break = n;
    }

    @Override
    public void close() {
        if (this.id_throws != null) {
            MemoryUtil.memFree((Buffer)this.id_throws);
        }
        if (this.id_case != null) {
            MemoryUtil.memFree((Buffer)this.id_case);
        }
    }

    public void id_break() {
        if (!this.id_private) {
            // empty if block
        }
        this.id_private = false;
        if (this.id_protected <= 3) {
            this.id_protected();
        } else if (this.id_protected <= 7) {
            this.id_throws();
        } else {
            if (this.id_protected > 10) {
                id_class.warn("Uniform.upload called, but type value ({}) is not a valid type. Ignoring.", (Object)this.id_protected);
                return;
            }
            this.id_case();
        }
    }

    public static int id_break(int n, CharSequence charSequence) {
        return MT.id_byte(n, charSequence);
    }

    @Override
    public void id_break(float f, float f2, float f3, float f4) {
        ((Buffer)this.id_case).position(0);
        if (this.id_protected >= 4) {
            this.id_case.put(0, f);
        }
        if (this.id_protected >= 5) {
            this.id_case.put(1, f2);
        }
        if (this.id_protected >= 6) {
            this.id_case.put(2, f3);
        }
        if (this.id_protected >= 7) {
            this.id_case.put(3, f4);
        }
        this.id_byte();
    }

    private void id_throws() {
        ((Buffer)this.id_case).clear();
        switch (this.id_protected) {
            case 4: {
                RenderSystem.glUniform1(this.id_break, this.id_case);
                break;
            }
            case 5: {
                RenderSystem.glUniform2(this.id_break, this.id_case);
                break;
            }
            case 6: {
                RenderSystem.glUniform3(this.id_break, this.id_case);
                break;
            }
            case 7: {
                RenderSystem.glUniform4(this.id_break, this.id_case);
                break;
            }
            default: {
                id_class.warn("Uniform.upload called, but count value ({}) is not in the range of 1 to 4. Ignoring.", (Object)this.id_byte);
            }
        }
    }

    private void id_case() {
        ((Buffer)this.id_case).clear();
        switch (this.id_protected) {
            case 8: {
                RenderSystem.glUniformMatrix2(this.id_break, false, this.id_case);
                break;
            }
            case 9: {
                RenderSystem.glUniformMatrix3(this.id_break, false, this.id_case);
                break;
            }
            case 10: {
                RenderSystem.glUniformMatrix4(this.id_break, false, this.id_case);
            }
        }
    }

    private void id_protected() {
        ((Buffer)this.id_case).clear();
        switch (this.id_protected) {
            case 0: {
                RenderSystem.glUniform1(this.id_break, this.id_throws);
                break;
            }
            case 1: {
                RenderSystem.glUniform2(this.id_break, this.id_throws);
                break;
            }
            case 2: {
                RenderSystem.glUniform3(this.id_break, this.id_throws);
                break;
            }
            case 3: {
                RenderSystem.glUniform4(this.id_break, this.id_throws);
                break;
            }
            default: {
                id_class.warn("Uniform.upload called, but count value ({}) is  not in the range of 1 to 4. Ignoring.", (Object)this.id_byte);
            }
        }
    }
}

