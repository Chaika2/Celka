/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.hash.Hashing
 *  com.mojang.datafixers.util.Function4
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.commons.lang3.Validate
 */
package celestial;

import celestial.Fr_1;
import celestial.Lg_1;
import celestial.Ml_1;
import celestial.Np_1;
import celestial.QK;
import celestial.QY;
import celestial.Qw_1;
import celestial.ZA;
import celestial.ZE;
import celestial.cN_2;
import celestial.ch_3;
import celestial.cm_3;
import celestial.fN_2;
import celestial.ff_3;
import celestial.fk_3;
import celestial.jI_2;
import celestial.mQ_2;
import celestial.mT_2;
import celestial.mo_3;
import celestial.my_3;
import celestial.rAL;
import celestial.rTH;
import celestial.rVm_1;
import celestial.rVv_1;
import celestial.rYE;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rpl_3;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rqn_3;
import celestial.rqu_3;
import celestial.rrGP;
import celestial.rrGd_1;
import celestial.rrGk_1;
import celestial.rrGm_1;
import celestial.rrGr_1;
import celestial.rrSp_1;
import celestial.vY_2;
import celestial.va_3;
import com.google.common.collect.ImmutableList;
import com.google.common.hash.Hashing;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Function4;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

public final class vi_3
extends Lg_1<vi_3>
implements AutoCloseable {
    private final QY id_break;
    private final Fr_1 id_byte;
    public final rrGm_1 id_protected;
    private final rqO_2 id_throws;
    private File id_case;
    private final fk_3 id_catch;
    private long id_private;
    public final /* synthetic */ va_3 id_class;

    public void id_byte() {
        String string = this.id_protected.id_class();
        try {
            rrGk_1 rrGk_12 = this.id_break.M().id_byte(string);
            this.id_break.id_break(new ZA(bl -> {
                try {
                    rrGk_12.close();
                }
                catch (IOException iOException) {
                    va_3.id_throws.error("Failed to unlock level {}", (Object)string, (Object)iOException);
                }
                if (bl) {
                    this.id_class.id_class(() -> this.id_byte.id_throws.id_private(), true);
                }
                this.id_break.id_break(this.id_byte);
            }, rrGk_12));
        }
        catch (IOException iOException) {
            va_3.id_throws.error("Failed to access level {}", (Object)string, (Object)iOException);
            this.id_class.id_class(() -> this.id_byte.id_throws.id_private(), true);
        }
    }

    public vi_3(va_3 va_32, va_3 va_33, rrGm_1 rrGm_12) {
        this.id_class = va_32;
        this.id_byte = va_33.id_implements();
        this.id_protected = rrGm_12;
        this.id_break = QY.id_instanceof();
        String string = rrGm_12.id_class();
        this.id_throws = new rqO_2("minecraft", "worlds/" + rqR_2.id_class(string, rqO_2::id_break) + "/" + Hashing.sha1().hashUnencodedChars((CharSequence)string) + "/icon");
        this.id_case = rrGm_12.id_byte();
        if (!this.id_case.isFile()) {
            this.id_case = null;
        }
        this.id_catch = this.id_catch();
    }

    public void id_class() {
        if (!this.id_protected.id_final()) {
            if (this.id_protected.id_volatile()) {
                rgn_3 rgn_32 = new rgn_3("selectWorld.backupQuestion");
                rgn_3 rgn_33 = new rgn_3("selectWorld.backupWarning", this.id_protected.id_implements(), rqu_3.id_class().getName());
                this.id_break.id_break(new my_3(this.id_byte, (bl, bl2) -> {
                    if (bl) {
                        String string = this.id_protected.id_class();
                        try (rrGk_1 rrGk_12 = this.id_break.M().id_byte(string);){
                            ZA.id_class(rrGk_12);
                        }
                        catch (IOException iOException) {
                            va_3.id_throws.error("Failed to backup level {}", (Object)string, (Object)iOException);
                        }
                    }
                    this.id_throws();
                }, rgn_32, rgn_33, false));
            } else if (this.id_protected.id_native()) {
                this.id_break.id_break(new mT_2(bl -> {
                    if (bl) {
                        try {
                            this.id_throws();
                        }
                        catch (Exception exception) {
                            va_3.id_throws.error("Failure to open 'future world'", (Throwable)exception);
                            this.id_break.id_break(new mQ_2(() -> this.id_break.id_break(this.id_byte), new rgn_3("selectWorld.futureworld.error.title"), new rgn_3("selectWorld.futureworld.error.text")));
                        }
                    } else {
                        this.id_break.id_break(this.id_byte);
                    }
                }, new rgn_3("selectWorld.versionQuestion"), new rgn_3("selectWorld.versionWarning", this.id_protected.id_implements(), new rgn_3("selectWorld.versionJoinButton"), cN_2.id_protected)));
            } else {
                this.id_throws();
            }
        }
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        Object object = this.id_protected.id_break();
        String string = this.id_protected.id_class() + " (" + va_3.id_case.format(new Date(this.id_protected.id_throws())) + ")";
        if (StringUtils.isEmpty((CharSequence)object)) {
            object = jI_2.id_class("selectWorld.world", new Object[0]) + " " + (n + 1);
        }
        rgP_2 rgP_22 = this.id_protected.id_package();
        ((cm_3)this.id_break.id_class[15]).id_break(ml_1, (String)object, (float)(n3 + 32 + 3), (float)(n2 + 1), 0xFFFFFF);
        ((cm_3)this.id_break.id_class[15]).id_break(ml_1, string, (float)(n3 + 32 + 3), (float)(n2 + 9 + 3), 0x808080);
        ((cm_3)this.id_break.id_class[15]).id_byte(ml_1, rgP_22, n3 + 32 + 3, n2 + 9 + 9 + 3, 0x808080);
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.id_break.A().id_class(this.id_catch != null ? this.id_throws : va_3.id_catch);
        RenderSystem.enableBlend();
        ch_3.id_class(ml_1, n3, n2, 0.0f, 0.0f, 32, 32, 32, 32);
        RenderSystem.disableBlend();
        if (((Qw_1)this.id_break.id_class[20]).S || bl) {
            int n8;
            this.id_break.A().id_class(va_3.id_class);
            ch_3.id_class(ml_1, n3, n2, n3 + 32, n2 + 32, -1601138544);
            RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
            int n9 = n6 - n3;
            boolean bl2 = n9 < 32;
            int n10 = n8 = bl2 ? 32 : 0;
            if (this.id_protected.id_final()) {
                ch_3.id_class(ml_1, n3, n2, 96.0f, (float)n8, 32, 32, 256, 256);
                if (bl2) {
                    this.id_byte.id_break(((cm_3)this.id_break.id_class[15]).id_break(va_3.id_return, 175));
                }
            } else if (this.id_protected.id_extends()) {
                ch_3.id_class(ml_1, n3, n2, 32.0f, (float)n8, 32, 32, 256, 256);
                if (this.id_protected.id_native()) {
                    ch_3.id_class(ml_1, n3, n2, 96.0f, (float)n8, 32, 32, 256, 256);
                    if (bl2) {
                        this.id_byte.id_break((List<rpl_3>)ImmutableList.of((Object)va_3.id_private.id_catch(), (Object)va_3.id_implements.id_catch()));
                    }
                } else if (!rqu_3.id_class().isStable()) {
                    ch_3.id_class(ml_1, n3, n2, 64.0f, (float)n8, 32, 32, 256, 256);
                    if (bl2) {
                        this.id_byte.id_break((List<rpl_3>)ImmutableList.of((Object)va_3.id_finally.id_catch(), (Object)va_3.id_extends.id_catch()));
                    }
                }
            } else {
                ch_3.id_class(ml_1, n3, n2, 0.0f, (float)n8, 32, 32, 256, 256);
            }
        }
    }

    @Override
    public void close() {
        if (this.id_catch != null) {
            this.id_catch.close();
        }
    }

    public void id_break() {
        this.id_break.id_break(new mT_2(bl -> {
            if (bl) {
                this.id_break.id_break(new vY_2());
                rrGd_1 rrGd_12 = this.id_break.M();
                String string = this.id_protected.id_class();
                try (rrGk_1 rrGk_12 = rrGd_12.id_byte(string);){
                    rrGk_12.id_catch();
                }
                catch (IOException iOException) {
                    va_3.id_throws.error("Failed to delete world {}", (Object)string, (Object)iOException);
                }
                this.id_class.id_class(() -> this.id_byte.id_throws.id_private(), true);
            }
            this.id_break.id_break(this.id_byte);
        }, new rgn_3("selectWorld.deleteQuestion"), new rgn_3("selectWorld.deleteWarning", this.id_protected.id_break()), new rgn_3("selectWorld.deleteButton"), cN_2.id_protected));
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        if (this.id_protected.id_final()) {
            return true;
        }
        this.id_class.id_class(this);
        this.id_byte.id_byte(this.id_class.id_private().isPresent());
        if (d - (double)this.id_class.id_continue() <= 32.0) {
            this.id_class();
            return true;
        }
        if (rqR_2.id_break() - this.id_private < 250L) {
            this.id_class();
            return true;
        }
        this.id_private = rqR_2.id_break();
        return false;
    }

    private void id_throws() {
        this.id_break.c().id_class(Np_1.id_class(rqn_3.dw, 1.0f));
        if (this.id_break.M().id_break(this.id_protected.id_class())) {
            this.id_case();
            this.id_break.id_break(this.id_protected.id_class());
        }
    }

    private fk_3 id_catch() {
        boolean bl;
        boolean bl2 = bl = this.id_case != null && this.id_case.isFile();
        if (bl) {
            fk_3 fk_32;
            FileInputStream fileInputStream = new FileInputStream(this.id_case);
            try {
                fN_2 fN_22 = fN_2.id_class(fileInputStream);
                Validate.validState((fN_22.id_class() == 64 ? 1 : 0) != 0, (String)"Must be 64 pixels wide", (Object[])new Object[0]);
                Validate.validState((fN_22.id_break() == 64 ? 1 : 0) != 0, (String)"Must be 64 pixels high", (Object[])new Object[0]);
                fk_3 fk_33 = new fk_3(fN_22);
                this.id_break.A().id_class(this.id_throws, (ff_3)fk_33);
                fk_32 = fk_33;
            }
            catch (Throwable throwable) {
                try {
                    try {
                        ((InputStream)fileInputStream).close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                    throw throwable;
                }
                catch (Throwable throwable3) {
                    va_3.id_throws.error("Invalid icon for world {}", (Object)this.id_protected.id_class(), (Object)throwable3);
                    this.id_case = null;
                    return null;
                }
            }
            ((InputStream)fileInputStream).close();
            return fk_32;
        }
        this.id_break.A().id_byte(this.id_throws);
        return null;
    }

    private void id_case() {
        this.id_break.id_class(new ZE(new rgn_3("selectWorld.data_read")));
    }

    public void id_protected() {
        this.id_case();
        rVv_1 rVv_12 = rVm_1.id_break();
        try (rrGk_1 rrGk_12 = this.id_break.M().id_byte(this.id_protected.id_class());
             QK qK = this.id_break.id_class(rVv_12, QY::id_class, (Function4<rrGk_1, rVv_1, rAL, rTH, rrGP>)((Function4)QY::id_class), false, rrGk_12);){
            rYE rYE2 = qK.id_byte().id_throw();
            rTH rTH2 = rYE2.id_catch();
            rrSp_1 rrSp_12 = qK.id_byte().id_long();
            Path path = mo_3.id_class(rrGk_12.id_class(rrGr_1.id_catch), this.id_break);
            if (rrSp_12.id_implements()) {
                this.id_break.id_break(new mT_2(bl -> this.id_break.id_break(bl ? new mo_3(this.id_byte, rYE2, rrSp_12, path, rTH2, rVv_12) : this.id_byte), new rgn_3("selectWorld.recreate.customized.title"), new rgn_3("selectWorld.recreate.customized.text"), cN_2.id_catch, cN_2.id_protected));
            } else {
                this.id_break.id_break(new mo_3(this.id_byte, rYE2, rrSp_12, path, rTH2, rVv_12));
            }
        }
        catch (Exception exception) {
            va_3.id_throws.error("Unable to recreate world", (Throwable)exception);
            this.id_break.id_break(new mQ_2(() -> this.id_break.id_break(this.id_byte), new rgn_3("selectWorld.recreate.error.title"), new rgn_3("selectWorld.recreate.error.text")));
        }
    }
}

