/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.MK;
import celestial.Ml_1;
import celestial.OP;
import celestial.ch_3;
import celestial.cm_3;
import celestial.ju_3;
import celestial.lD_2;
import celestial.rAF;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rpl_3;
import celestial.rqO_2;
import celestial.vm_3;
import celestial.yb_3;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Random;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class vg_3
extends vm_3 {
    private static final Logger id_class = LogManager.getLogger();
    private static final rqO_2 id_throws = new rqO_2("textures/gui/title/minecraft.png");
    private static final rqO_2 id_case = new rqO_2("textures/gui/title/edition.png");
    private static final rqO_2 id_catch = new rqO_2("textures/misc/vignette.png");
    private static final String id_private = "" + rgF_2.WHITE + rgF_2.OBFUSCATED + rgF_2.GREEN + rgF_2.AQUA;
    private final boolean id_implements;
    private final Runnable id_finally;
    private float id_else;
    private List<rpl_3> id_synchronized;
    private IntSet id_return;
    private int id_public;
    private float id_goto = 0.5f;

    public vg_3(boolean bl, Runnable runnable) {
        super(rgN_2.id_byte);
        this.id_implements = bl;
        this.id_finally = runnable;
        if (!bl) {
            this.id_goto = 0.75f;
        }
    }

    @Override
    public void id_class(Ml_1 ml_1, int n3, int n4, float f) {
        int n5;
        this.id_class(n3, n4, f);
        int n6 = 274;
        int n7 = this.id_package / 2 - 137;
        int n8 = this.id_int + 50;
        this.id_else += f;
        float f2 = -this.id_else * this.id_goto;
        RenderSystem.pushMatrix();
        RenderSystem.translatef(0.0f, f2, 0.0f);
        this.id_volatile.A().id_class(id_throws);
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.enableAlphaTest();
        RenderSystem.enableBlend();
        this.id_class(n7, n8, (Integer n, Integer n2) -> {
            this.id_break(ml_1, n + 0, (int)n2, 0, 0, 155, 44);
            this.id_break(ml_1, n + 155, (int)n2, 0, 45, 155, 44);
        });
        RenderSystem.disableBlend();
        this.id_volatile.A().id_class(id_case);
        vg_3.id_class(ml_1, n7 + 88, n8 + 37, 0.0f, 0.0f, 98, 14, 128, 16);
        RenderSystem.disableAlphaTest();
        int n9 = n8 + 100;
        for (n5 = 0; n5 < this.id_synchronized.size(); ++n5) {
            float f3;
            if (n5 == this.id_synchronized.size() - 1 && (f3 = (float)n9 + f2 - (float)(this.id_int / 2 - 6)) < 0.0f) {
                RenderSystem.translatef(0.0f, -f3, 0.0f);
            }
            if ((float)n9 + f2 + 12.0f + 8.0f > 0.0f && (float)n9 + f2 < (float)this.id_int) {
                rpl_3 rpl_32 = this.id_synchronized.get(n5);
                if (this.id_return.contains(n5)) {
                    this.id_super.id_class(ml_1, rpl_32, (float)(n7 + (274 - this.id_super.id_class(rpl_32)) / 2), (float)n9, 0xFFFFFF);
                } else {
                    this.id_super.id_break.setSeed((long)((float)((long)n5 * 4238972211L) + this.id_else / 4.0f));
                    this.id_super.id_class(ml_1, rpl_32, (float)n7, (float)n9, 0xFFFFFF);
                }
            }
            n9 += 12;
        }
        RenderSystem.popMatrix();
        this.id_volatile.A().id_class(id_catch);
        RenderSystem.enableBlend();
        RenderSystem.blendFunc(OP.ZERO, MK.ONE_MINUS_SRC_COLOR);
        n5 = this.id_package;
        int n10 = this.id_int;
        yb_3 yb_32 = yb_3.id_class();
        lD_2 lD_22 = yb_32.id_byte();
        lD_22.id_class(7, ju_3.id_public);
        lD_22.id_class(0.0, (double)n10, (double)this.h_()).id_class(0.0f, 1.0f).id_class(1.0f, 1.0f, 1.0f, 1.0f).id_class();
        lD_22.id_class((double)n5, (double)n10, (double)this.h_()).id_class(1.0f, 1.0f).id_class(1.0f, 1.0f, 1.0f, 1.0f).id_class();
        lD_22.id_class((double)n5, 0.0, (double)this.h_()).id_class(1.0f, 0.0f).id_class(1.0f, 1.0f, 1.0f, 1.0f).id_class();
        lD_22.id_class(0.0, 0.0, (double)this.h_()).id_class(0.0f, 0.0f).id_class(1.0f, 1.0f, 1.0f, 1.0f).id_class();
        yb_32.id_break();
        RenderSystem.disableBlend();
        super.id_class(ml_1, n3, n4, f);
    }

    private void id_class(int n, int n2, float f) {
        this.id_volatile.A().id_class(ch_3.id_break);
        int n3 = this.id_package;
        float f2 = -this.id_else * 0.5f * this.id_goto;
        float f3 = (float)this.id_int - this.id_else * 0.5f * this.id_goto;
        float f4 = 0.015625f;
        float f5 = this.id_else * 0.02f;
        float f6 = (float)(this.id_public + this.id_int + this.id_int + 24) / this.id_goto;
        float f7 = (f6 - 20.0f - this.id_else) * 0.005f;
        if (f7 < f5) {
            f5 = f7;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        f5 *= f5;
        f5 = f5 * 96.0f / 255.0f;
        yb_3 yb_32 = yb_3.id_class();
        lD_2 lD_22 = yb_32.id_byte();
        lD_22.id_class(7, ju_3.id_public);
        lD_22.id_class(0.0, (double)this.id_int, (double)this.h_()).id_class(0.0f, f2 * 0.015625f).id_class(f5, f5, f5, 1.0f).id_class();
        lD_22.id_class((double)n3, (double)this.id_int, (double)this.h_()).id_class((float)n3 * 0.015625f, f2 * 0.015625f).id_class(f5, f5, f5, 1.0f).id_class();
        lD_22.id_class((double)n3, 0.0, (double)this.h_()).id_class((float)n3 * 0.015625f, f3 * 0.015625f).id_class(f5, f5, f5, 1.0f).id_class();
        lD_22.id_class(0.0, 0.0, (double)this.h_()).id_class(0.0f, f3 * 0.015625f).id_class(f5, f5, f5, 1.0f).id_class();
        yb_32.id_break();
    }

    private void id_finally() {
        this.id_finally.run();
        this.id_volatile.id_break((vm_3)null);
    }

    @Override
    public void id_private() {
        this.id_volatile.N().id_class();
        this.id_volatile.c().id_class(false);
        float f = (float)(this.id_public + this.id_int + this.id_int + 24) / this.id_goto;
        if (this.id_else > f) {
            this.id_finally();
        }
    }

    @Override
    public void id_volatile() {
        this.id_finally();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void v_() {
        if (this.id_synchronized == null) {
            this.id_synchronized = Lists.newArrayList();
            this.id_return = new IntOpenHashSet();
            rAF rAF2 = null;
            try {
                Object object;
                BufferedReader bufferedReader;
                InputStream inputStream;
                int n = 274;
                if (this.id_implements) {
                    int n2;
                    Object object2;
                    rAF2 = this.id_volatile.F().id_class(new rqO_2("texts/end.txt"));
                    inputStream = rAF2.id_break();
                    bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
                    object = new Random(8124371L);
                    while ((object2 = bufferedReader.readLine()) != null) {
                        object2 = ((String)object2).replaceAll("PLAYERNAME", this.id_volatile.id_while().id_byte());
                        while ((n2 = ((String)object2).indexOf(id_private)) != -1) {
                            String object3 = ((String)object2).substring(0, n2);
                            String string = ((String)object2).substring(n2 + id_private.length());
                            object2 = object3 + rgF_2.WHITE + rgF_2.OBFUSCATED + "XXXXXXXX".substring(0, ((Random)object).nextInt(4) + 3) + string;
                        }
                        this.id_synchronized.addAll(((cm_3)this.id_volatile.id_class[15]).id_break(new rgN_2((String)object2), 274));
                        this.id_synchronized.add(rpl_3.id_class);
                    }
                    inputStream.close();
                    for (n2 = 0; n2 < 8; ++n2) {
                        this.id_synchronized.add(rpl_3.id_class);
                    }
                }
                inputStream = this.id_volatile.F().id_class(new rqO_2("texts/credits.txt")).id_break();
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
                while ((object = bufferedReader.readLine()) != null) {
                    boolean bl;
                    object = ((String)object).replaceAll("PLAYERNAME", this.id_volatile.id_while().id_byte());
                    if (((String)(object = ((String)object).replaceAll("\t", "    "))).startsWith("[C]")) {
                        object = ((String)object).substring(3);
                        bl = true;
                    } else {
                        bl = false;
                    }
                    for (rpl_3 rpl_32 : ((cm_3)this.id_volatile.id_class[15]).id_break(new rgN_2((String)object), 274)) {
                        if (bl) {
                            this.id_return.add(this.id_synchronized.size());
                        }
                        this.id_synchronized.add(rpl_32);
                    }
                    this.id_synchronized.add(rpl_3.id_class);
                }
                inputStream.close();
                this.id_public = this.id_synchronized.size() * 12;
                IOUtils.closeQuietly((Closeable)rAF2);
            }
            catch (Exception exception) {
                id_class.error("Couldn't load credits", (Throwable)exception);
            }
            finally {
                IOUtils.closeQuietly(rAF2);
            }
        }
    }
}

