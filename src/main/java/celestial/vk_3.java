/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.hash.Hashing
 *  org.apache.commons.lang3.mutable.MutableBoolean
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.Ar_1;
import celestial.LF;
import celestial.Li_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.cN_2;
import celestial.fN_2;
import celestial.fY_2;
import celestial.ff_3;
import celestial.fk_3;
import celestial.mT_2;
import celestial.rAC;
import celestial.rAp_1;
import celestial.rAt_1;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.vW_2;
import celestial.vd_3;
import celestial.vh_3;
import celestial.vm_3;
import com.google.common.collect.Maps;
import com.google.common.hash.Hashing;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class vk_3
extends vm_3 {
    public static final Logger id_implements = LogManager.getLogger();
    private static final rgP_2 id_finally = new rgn_3("pack.dropInfo").id_class(rgF_2.GRAY);
    private static final rgP_2 id_else = new rgn_3("pack.folderInfo");
    private static final rqO_2 id_synchronized = new rqO_2("textures/misc/unknown_pack.png");
    public final vh_3 id_class;
    public final vm_3 id_throws;
    private vW_2 id_return;
    private long id_public;
    protected Li_1 id_case;
    protected Li_1 id_catch;
    public final File id_private;
    private LF id_goto;
    private final Map<String, rqO_2> id_while = Maps.newHashMap();

    public vk_3(vm_3 vm_32, rAt_1 rAt_12, Consumer<rAt_1> consumer, File file, rgP_2 rgP_22) {
        super(rgP_22);
        this.id_throws = vm_32;
        this.id_class = new vh_3(this::id_final, this::id_class, rAt_12, consumer);
        this.id_private = file;
        this.id_return = vW_2.id_class(file);
    }

    /*
     * Enabled aggressive exception aggregation
     */
    private rqO_2 id_class(fY_2 fY_22, rAp_1 rAp_12) {
        try (rAC rAC2 = rAp_12.id_protected();){
            rqO_2 rqO_22;
            block15: {
                InputStream inputStream = rAC2.id_class("pack.png");
                try {
                    String string = rAp_12.id_throws();
                    rqO_2 rqO_23 = new rqO_2("minecraft", "pack/" + rqR_2.id_class(string, rqO_2::id_break) + "/" + Hashing.sha1().hashUnencodedChars((CharSequence)string) + "/icon");
                    fN_2 fN_22 = fN_2.id_class(inputStream);
                    fY_22.id_class(rqO_23, (ff_3)new fk_3(fN_22));
                    rqO_22 = rqO_23;
                    if (inputStream == null) break block15;
                }
                catch (Throwable throwable) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                inputStream.close();
            }
            return rqO_22;
        }
        catch (FileNotFoundException fileNotFoundException) {
        }
        catch (Exception exception) {
            id_implements.warn("Failed to load icon from pack {}", (Object)rAp_12.id_throws(), (Object)exception);
        }
        return id_synchronized;
    }

    protected void id_class(Li_1 li_1, Stream<vd_3> stream) {
        li_1.x_().clear();
        stream.forEach(vd_32 -> li_1.x_().add(new Ar_1(this.id_volatile, li_1, this, (vd_3)vd_32)));
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_protected(0);
        this.id_case.id_class(ml_1, n, n2, f);
        this.id_catch.id_class(ml_1, n, n2, f);
        vk_3.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2, 8, 0xFFFFFF);
        vk_3.id_class(ml_1, this.id_super, id_finally, this.id_package / 2, 20, 0xFFFFFF);
        super.id_class(ml_1, n, n2, f);
    }

    protected static void id_class(QY qY, List<Path> list, Path path) {
        MutableBoolean mutableBoolean = new MutableBoolean();
        list.forEach(path2 -> {
            try (Stream<Path> stream = Files.walk(path2, new FileVisitOption[0]);){
                stream.forEach(path3 -> {
                    try {
                        rqR_2.id_break(path2.getParent(), path, path3);
                    }
                    catch (IOException iOException) {
                        id_implements.warn("Failed to copy datapack file  from {} to {}", path3, (Object)path, (Object)iOException);
                        mutableBoolean.setTrue();
                    }
                });
            }
            catch (IOException iOException) {
                id_implements.warn("Failed to copy datapack file from {} to {}", path2, (Object)path);
                mutableBoolean.setTrue();
            }
        });
    }

    private rqO_2 id_class(rAp_1 rAp_12) {
        return this.id_while.computeIfAbsent(rAp_12.id_throws(), string -> this.id_class(this.id_volatile.A(), rAp_12));
    }

    protected void id_finally() {
        this.id_class.id_protected();
        this.id_final();
        this.id_public = 0L;
        this.id_while.clear();
    }

    @Override
    public void id_private() {
        if (this.id_return != null) {
            try {
                if (this.id_return.id_class()) {
                    this.id_public = 20L;
                }
            }
            catch (IOException iOException) {
                id_implements.warn("Failed to poll for directory {} changes, stopping", (Object)this.id_private);
                this.id_native();
            }
        }
        if (this.id_public > 0L && --this.id_public == 0L) {
            this.id_finally();
        }
    }

    private void id_final() {
        this.id_class(this.id_catch, this.id_class.id_break());
        this.id_class(this.id_case, this.id_class.id_class());
        this.id_goto.id_int = !this.id_catch.x_().isEmpty();
    }

    @Override
    public void id_volatile() {
        this.id_class.id_byte();
        this.id_volatile.id_break(this.id_throws);
        this.id_native();
    }

    private void id_native() {
        if (this.id_return != null) {
            try {
                this.id_return.close();
                this.id_return = null;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    @Override
    public void a_(List<Path> list) {
        String string = list.stream().map(Path::getFileName).map(Path::toString).collect(Collectors.joining(", "));
        this.id_volatile.id_break(new mT_2(bl -> {
            if (bl) {
                vk_3.id_class(this.id_volatile, list, this.id_private.toPath());
                this.id_finally();
            }
            this.id_volatile.id_break(this);
        }, new rgn_3("pack.dropConfirm"), new rgN_2(string)));
    }

    @Override
    protected void v_() {
        this.id_goto = this.id_class(new LF(this.id_package / 2 + 4, this.id_int - 48, 150, 20, cN_2.id_byte, lF -> this.id_volatile()));
        this.id_class(new LF(this.id_package / 2 - 154, this.id_int - 48, 150, 20, new rgn_3("pack.openFolder"), lF -> rqR_2.id_implements().id_class(this.id_private), (lF, ml_1, n, n2) -> this.id_class(ml_1, id_else, n, n2)));
        this.id_case = new Li_1(this.id_volatile, 200, this.id_int, new rgn_3("pack.available.title"));
        this.id_case.id_throws(this.id_package / 2 - 4 - 200);
        this.id_native.add(this.id_case);
        this.id_catch = new Li_1(this.id_volatile, 200, this.id_int, new rgn_3("pack.selected.title"));
        this.id_catch.id_throws(this.id_package / 2 + 4);
        this.id_native.add(this.id_catch);
        this.id_finally();
    }
}

