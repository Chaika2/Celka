/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 */
package celestial;

import celestial.MT;
import celestial.jZ_2;
import celestial.lD_2;
import celestial.lU_2;
import celestial.rjV_2;
import celestial.rrxH_2;
import celestial.rrxZ_2;
import celestial.rrxl_3;
import celestial.rrxm_3;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.nio.ByteBuffer;
import java.util.concurrent.CompletableFuture;

public class jm_3
implements AutoCloseable {
    private int id_class;
    private final jZ_2 id_break;
    private int id_byte;
    private rrxH_2 id_protected;
    private rrxl_3 id_throws;
    private int id_case;
    private rrxm_3 id_catch;

    private void id_byte(lD_2 lD_22) {
        Pair<lU_2, ByteBuffer> pair = lD_22.id_extends();
        this.id_case = 0;
        lU_2 lU_22 = (lU_2)pair.getFirst();
        if (lU_22.id_protected() != 7) {
            this.id_case = lU_22.id_protected();
        }
        if (this.id_protected != null) {
            ByteBuffer byteBuffer = (ByteBuffer)pair.getSecond();
            this.id_protected.id_class(byteBuffer, this.id_throws);
        } else {
            this.id_catch = lU_22.id_class();
            if (this.id_class != -1) {
                ByteBuffer byteBuffer = (ByteBuffer)pair.getSecond();
                this.id_byte = byteBuffer.remaining() / this.id_break.id_break();
                this.id_class();
                RenderSystem.glBufferData(34962, byteBuffer, 35044);
                jm_3.id_break();
            }
        }
    }

    public rrxH_2 id_byte() {
        return this.id_protected;
    }

    public jm_3(jZ_2 jZ_22) {
        this.id_break = jZ_22;
        RenderSystem.glGenBuffers(n -> {
            this.id_class = n;
        });
    }

    public void id_class(int n) {
        if (this.id_case > 0) {
            n = this.id_case;
        }
        if (this.id_protected != null) {
            this.id_protected.id_class(n, this.id_throws);
        } else if (this.id_catch != null) {
            rrxZ_2.id_class(n, this.id_catch);
        } else {
            RenderSystem.drawArrays(n, 0, this.id_byte);
        }
    }

    public void id_class(rrxH_2 rrxH_22) {
        if (rrxH_22 != null) {
            this.close();
            this.id_protected = rrxH_22;
            this.id_throws = new rrxl_3();
        }
    }

    public void id_class() {
        MT.id_catch(34962, this.id_class);
    }

    public void id_class(lD_2 lD_22) {
        if (!RenderSystem.isOnRenderThread()) {
            RenderSystem.recordRenderCall(() -> this.id_byte(lD_22));
        } else {
            this.id_byte(lD_22);
        }
    }

    public void id_class(rjV_2 rjV_22, int n) {
        RenderSystem.pushMatrix();
        RenderSystem.loadIdentity();
        RenderSystem.multMatrix(rjV_22);
        if (this.id_case > 0) {
            n = this.id_case;
        }
        if (this.id_protected != null) {
            this.id_protected.id_class(n, this.id_throws);
        } else if (this.id_catch != null) {
            rrxZ_2.id_class(n, this.id_catch);
        } else {
            RenderSystem.drawArrays(n, 0, this.id_byte);
        }
        RenderSystem.popMatrix();
    }

    @Override
    public void close() {
        if (this.id_class >= 0) {
            RenderSystem.glDeleteBuffers(this.id_class);
            this.id_class = -1;
        }
    }

    public static void id_break() {
        MT.id_catch(34962, 0);
    }

    public CompletableFuture<Void> id_break(lD_2 lD_22) {
        if (!RenderSystem.isOnRenderThread()) {
            return CompletableFuture.runAsync(() -> this.id_byte(lD_22), runnable -> RenderSystem.recordRenderCall(runnable::run));
        }
        this.id_byte(lD_22);
        return CompletableFuture.completedFuture(null);
    }
}

