/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.util.Pair
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.LF;
import celestial.LZ;
import celestial.Lu_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.Qj_1;
import celestial.ZE;
import celestial.ZJ;
import celestial.Zr_1;
import celestial.cC_2;
import celestial.cN_2;
import celestial.gq_3;
import celestial.jI_2;
import celestial.mD_2;
import celestial.mK_2;
import celestial.mN_2;
import celestial.mT_2;
import celestial.mU_2;
import celestial.me_3;
import celestial.mi_3;
import celestial.rAZ;
import celestial.rAf_1;
import celestial.rAh_1;
import celestial.rAt_1;
import celestial.rAz_1;
import celestial.rRO;
import celestial.rRl_1;
import celestial.rRu_1;
import celestial.rTH;
import celestial.rVL;
import celestial.rVm_1;
import celestial.rVv_1;
import celestial.rYE;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rnW_2;
import celestial.rpz_3;
import celestial.rqR_2;
import celestial.rrGk_1;
import celestial.rrGr_1;
import celestial.rrSp_1;
import celestial.vK_2;
import celestial.vk_3;
import celestial.vm_3;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class mo_3
extends vm_3 {
    private static final Logger id_catch = LogManager.getLogger();
    public static final rgP_2 id_private = new rgn_3("selectWorld.gameMode");
    private static final rgP_2 id_implements = new rgn_3("selectWorld.enterSeed");
    private static final rgP_2 id_finally = new rgn_3("selectWorld.seedInfo");
    private static final rgP_2 id_else = new rgn_3("selectWorld.enterName");
    private static final rgP_2 id_synchronized = new rgn_3("selectWorld.resultFolder");
    private static final rgP_2 id_return = new rgn_3("selectWorld.allowCommands.info");
    private final vm_3 id_public;
    private Lu_1 id_goto;
    public String id_while;
    public Zr_1 id_try = Zr_1.SURVIVAL;
    private Zr_1 id_instanceof;
    private rRO id_throw = rRO.NORMAL;
    public rRO id_interface = rRO.NORMAL;
    public boolean id_char;
    private boolean id_abstract;
    public boolean id_class;
    protected rTH id_throws;
    private Path id_long;
    private rAt_1 id_float;
    private boolean id_boolean;
    private LF id_transient;
    private LF id_for;
    private LF id_double;
    private LF id_switch;
    private LF r;
    private LF P;
    private LF B;
    public rgP_2 S;
    public rgP_2 s;
    private String E;
    private rRu_1 G = new rRu_1();
    public final vK_2 id_case;

    private void id_char() {
        this.id_byte(!this.id_boolean);
    }

    private void id_byte(boolean bl) {
        this.id_boolean = bl;
        this.id_for.id_new = !this.id_boolean;
        boolean bl2 = this.id_double.id_new = !this.id_boolean;
        if (this.id_case.id_class()) {
            this.P.id_new = false;
            this.id_for.id_int = false;
            if (this.id_instanceof == null) {
                this.id_instanceof = this.id_try;
            }
            this.id_class(Zr_1.DEBUG);
            this.B.id_new = false;
        } else {
            this.id_for.id_int = true;
            if (this.id_instanceof != null) {
                this.id_class(this.id_instanceof);
            }
            this.B.id_new = !this.id_boolean;
            this.P.id_new = !this.id_boolean;
        }
        this.id_case.id_break(this.id_boolean);
        this.id_goto.id_private(!this.id_boolean);
        if (this.id_boolean) {
            this.id_switch.id_break(cN_2.id_byte);
        } else {
            this.id_switch.id_break(new rgn_3("selectWorld.moreWorldOptions"));
        }
        this.r.id_new = !this.id_boolean;
    }

    private void id_int() {
        this.id_while = this.id_goto.id_private().trim();
        if (this.id_while.isEmpty()) {
            this.id_while = "World";
        }
        try {
            this.id_while = rpz_3.id_class(this.id_volatile.M().id_break(), this.id_while, "");
        }
        catch (Exception exception) {
            this.id_while = "World";
            try {
                this.id_while = rpz_3.id_class(this.id_volatile.M().id_break(), this.id_while, "");
            }
            catch (Exception exception2) {
                throw new RuntimeException("Could not create save folder", exception2);
            }
        }
    }

    private void id_long() {
        Pair<File, rAt_1> pair = this.id_static();
        if (pair != null) {
            this.id_volatile.id_break(new vk_3(this, (rAt_1)pair.getSecond(), this::id_class, (File)pair.getFirst(), new rgn_3("dataPack.title")));
        }
    }

    private void id_float() {
        if (this.id_long != null) {
            try (Stream<Path> stream = Files.walk(this.id_long, new FileVisitOption[0]);){
                stream.sorted(Comparator.reverseOrder()).forEach(path -> {
                    try {
                        Files.delete(path);
                    }
                    catch (IOException iOException) {
                        id_catch.warn("Failed to remove temporary file {}", path, (Object)iOException);
                    }
                });
            }
            catch (IOException iOException) {
                id_catch.warn("Failed to list temporary dir {}", (Object)this.id_long);
            }
            this.id_long = null;
        }
    }

    public mo_3(vm_3 vm_32, rYE rYE2, rrSp_1 rrSp_12, Path path, rTH rTH2, rVv_1 rVv_12) {
        this(vm_32, rTH2, new vK_2(rVv_12, rrSp_12, mN_2.id_class(rrSp_12), OptionalLong.of(rrSp_12.id_class())));
        this.E = rYE2.id_class();
        this.id_char = rYE2.id_throws();
        this.id_abstract = true;
        this.id_interface = this.id_throw = rYE2.id_protected();
        this.G.id_class(rYE2.id_case(), null);
        if (rYE2.id_byte()) {
            this.id_try = Zr_1.HARDCORE;
        } else if (rYE2.id_break().id_case()) {
            this.id_try = Zr_1.SURVIVAL;
        } else if (rYE2.id_break().id_throws()) {
            this.id_try = Zr_1.CREATIVE;
        }
        this.id_long = path;
    }

    private mo_3(vm_3 vm_32, rTH rTH2, vK_2 vK_22) {
        super(new rgn_3("selectWorld.create"));
        this.id_public = vm_32;
        this.E = jI_2.id_class("selectWorld.newWorld", new Object[0]);
        this.id_throws = rTH2;
        this.id_case = vK_22;
    }

    private void id_interface() {
        this.id_volatile.id_class(new ZE(new rgn_3("createWorld.preparing")));
        if (this.id_void()) {
            rYE rYE2;
            this.id_abstract();
            rrSp_1 rrSp_12 = this.id_case.id_class(this.id_class);
            if (rrSp_12.id_catch()) {
                rRu_1 rRu_12 = new rRu_1();
                rRu_12.id_class(rRu_1.id_finally).id_class(false, (rnW_2)null);
                rYE2 = new rYE(this.id_goto.id_private().trim(), rRl_1.SPECTATOR, false, rRO.PEACEFUL, true, rRu_12, rTH.id_class);
            } else {
                rYE2 = new rYE(this.id_goto.id_private().trim(), this.id_try.field_228218_f_, this.id_class, this.id_interface, this.id_char && !this.id_class, this.G, this.id_throws);
            }
            this.id_volatile.id_class(this.id_while, rYE2, this.id_case.id_break(), rrSp_12);
        }
    }

    private void id_class(rAt_1 rAt_12) {
        ImmutableList immutableList = ImmutableList.copyOf(rAt_12.id_protected());
        List list = (List)rAt_12.id_break().stream().filter(arg_0 -> mo_3.id_class((List)immutableList, arg_0)).collect(ImmutableList.toImmutableList());
        rTH rTH2 = new rTH((List<String>)immutableList, list);
        if (immutableList.equals(this.id_throws.id_class())) {
            this.id_throws = rTH2;
        } else {
            this.id_volatile.id_private(() -> this.id_volatile.id_break(new ZE(new rgn_3("dataPack.validation.working"))));
            rAh_1.id_class(rAt_12.id_case(), gq_3.INTEGRATED, 2, rqR_2.id_case(), this.id_volatile).handle((rAh_12, throwable) -> {
                if (throwable != null) {
                    id_catch.warn("Failed to validate datapack", throwable);
                    this.id_volatile.id_private(() -> this.id_volatile.id_break(new mT_2(bl -> {
                        if (bl) {
                            this.id_long();
                        } else {
                            this.id_throws = rTH.id_class;
                            this.id_volatile.id_break(this);
                        }
                    }, new rgn_3("dataPack.validation.failed"), rgN_2.id_byte, new rgn_3("dataPack.validation.back"), new rgn_3("dataPack.validation.reset"))));
                } else {
                    this.id_volatile.id_private(() -> {
                        this.id_throws = rTH2;
                        this.id_case.id_class((rAh_1)rAh_12);
                        rAh_12.close();
                        this.id_volatile.id_break(this);
                    });
                }
                return null;
            });
        }
    }

    private static void id_class(Path path, Path path2, Path path3) {
        try {
            rqR_2.id_break(path, path2, path3);
        }
        catch (IOException iOException) {
            id_catch.warn("Failed to copy datapack file from {} to {}", (Object)path3, (Object)path2);
            throw new mi_3(iOException);
        }
    }

    @Override
    public <T extends LZ> T id_class(T t) {
        return super.id_class(t);
    }

    public static Path id_class(Path path, QY qY) {
        MutableObject mutableObject = new MutableObject();
        try (Stream<Path> stream = Files.walk(path, new FileVisitOption[0]);){
            stream.filter(path2 -> !path2.equals(path)).forEach(path2 -> {
                Path path3 = (Path)mutableObject.getValue();
                if (path3 == null) {
                    try {
                        path3 = Files.createTempDirectory("mcworld-", new FileAttribute[0]);
                    }
                    catch (IOException iOException) {
                        id_catch.warn("Failed to create temporary dir");
                        throw new mi_3(iOException);
                    }
                    mutableObject.setValue((Object)path3);
                }
                mo_3.id_class(path, path3, path2);
            });
        }
        catch (mi_3 | IOException exception) {
            id_catch.warn("Failed to copy datapacks from world {}", (Object)path, (Object)exception);
            return null;
        }
        return (Path)mutableObject.getValue();
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        if (super.id_class(n, n2, n3)) {
            return true;
        }
        if (n != 257 && n != 335) {
            return false;
        }
        this.id_interface();
        return true;
    }

    private void id_class(Zr_1 zr_1) {
        if (!this.id_abstract) {
            boolean bl = this.id_char = zr_1 == Zr_1.CREATIVE;
        }
        if (zr_1 == Zr_1.HARDCORE) {
            this.id_class = true;
            this.B.id_int = false;
            this.id_case.id_class.id_int = false;
            this.id_interface = rRO.HARD;
            this.id_double.id_int = false;
        } else {
            this.id_class = false;
            this.B.id_int = true;
            this.id_case.id_class.id_int = true;
            this.id_interface = this.id_throw;
            this.id_double.id_int = true;
        }
        this.id_try = zr_1;
        this.id_package();
    }

    private static /* synthetic */ boolean id_class(List list, String string) {
        return !list.contains(string);
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class((LZ)((Object)ml_1));
        mo_3.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2, 20, -1);
        if (this.id_boolean) {
            mo_3.id_break(ml_1, this.id_super, id_implements, this.id_package / 2 - 100, 47, -6250336);
            mo_3.id_break(ml_1, this.id_super, id_finally, this.id_package / 2 - 100, 85, -6250336);
            this.id_case.id_class(ml_1, n, n2, f);
        } else {
            mo_3.id_break(ml_1, this.id_super, id_else, this.id_package / 2 - 100, 47, -6250336);
            mo_3.id_break(ml_1, this.id_super, new rgN_2("").id_class(id_synchronized).id_break(" ").id_break(this.id_while), this.id_package / 2 - 100, 85, -6250336);
            this.id_goto.id_class(ml_1, n, n2, f);
            mo_3.id_break(ml_1, this.id_super, this.S, this.id_package / 2 - 150, 122, -6250336);
            mo_3.id_break(ml_1, this.id_super, this.s, this.id_package / 2 - 150, 134, -6250336);
            if (this.B.id_new) {
                mo_3.id_break(ml_1, this.id_super, id_return, this.id_package / 2 - 150, 172, -6250336);
            }
        }
        super.id_class(ml_1, n, n2, f);
    }

    public static mo_3 id_class(vm_3 vm_32) {
        rVv_1 rVv_12 = rVm_1.id_break();
        return new mo_3(vm_32, rTH.id_class, new vK_2(rVv_12, rrSp_1.id_class(rVv_12.id_break(rVL.id_void), rVv_12.id_break(rVL.n), rVv_12.id_break(rVL.u)), Optional.of(mN_2.id_class), OptionalLong.empty()));
    }

    private boolean id_void() {
        if (this.id_long != null) {
            try (rrGk_1 rrGk_12 = this.id_volatile.M().id_byte(this.id_while);
                 Stream<Path> stream = Files.walk(this.id_long, new FileVisitOption[0]);){
                Path path3 = rrGk_12.id_class(rrGr_1.id_catch);
                Files.createDirectories(path3, new FileAttribute[0]);
                stream.filter(path -> !path.equals(this.id_long)).forEach(path2 -> mo_3.id_class(this.id_long, path3, path2));
            }
            catch (mi_3 | IOException exception) {
                id_catch.warn("Failed to copy datapacks to world {}", (Object)this.id_while, (Object)exception);
                this.id_native();
                return false;
            }
        }
        return true;
    }

    public void id_finally() {
        this.id_byte(this.id_boolean);
    }

    private void id_package() {
        this.S = new rgn_3("selectWorld.gameMode." + this.id_try.field_228217_e_ + ".line1");
        this.s = new rgn_3("selectWorld.gameMode." + this.id_try.field_228217_e_ + ".line2");
    }

    private Pair<File, rAt_1> id_static() {
        Path path = this.id_final();
        if (path != null) {
            File file = path.toFile();
            if (this.id_float == null) {
                this.id_float = new rAt_1(new rAf_1(), new rAz_1(file, rAZ.id_class));
                this.id_float.id_class();
            }
            this.id_float.id_class(this.id_throws.id_class());
            return Pair.of((Object)file, (Object)this.id_float);
        }
        return null;
    }

    @Override
    protected <T extends cC_2> T id_protected(T t) {
        return super.id_protected(t);
    }

    @Override
    public void id_private() {
        this.id_goto.id_catch();
        this.id_case.id_private();
    }

    private void id_abstract() {
        if (this.id_float != null) {
            this.id_float.close();
        }
        this.id_float();
    }

    protected Path id_final() {
        if (this.id_long == null) {
            try {
                this.id_long = Files.createTempDirectory("mcworld-", new FileAttribute[0]);
            }
            catch (IOException iOException) {
                id_catch.warn("Failed to create temporary dir", (Throwable)iOException);
                this.id_native();
            }
        }
        return this.id_long;
    }

    @Override
    public void id_volatile() {
        if (this.id_boolean) {
            this.id_byte(false);
        } else {
            this.id_native();
        }
    }

    public void id_native() {
        this.id_volatile.id_break(this.id_public);
        this.id_abstract();
    }

    @Override
    protected void v_() {
        ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
        this.id_goto = new mK_2(this, this.id_super, this.id_package / 2 - 100, 60, 200, 20, new rgn_3("selectWorld.enterName"));
        this.id_goto.id_class(this.E);
        this.id_goto.id_class((String string) -> {
            this.E = string;
            this.id_transient.id_int = !this.id_goto.id_private().isEmpty();
            this.id_int();
        });
        this.id_native.add(this.id_goto);
        int n = this.id_package / 2 - 155;
        int n2 = this.id_package / 2 + 5;
        this.id_for = this.id_class((LZ)new mD_2(this, n, 100, 150, 20, rgN_2.id_byte, lF -> {
            switch (this.id_try) {
                case SURVIVAL: {
                    this.id_class(Zr_1.HARDCORE);
                    break;
                }
                case HARDCORE: {
                    this.id_class(Zr_1.CREATIVE);
                    break;
                }
                case CREATIVE: {
                    this.id_class(Zr_1.SURVIVAL);
                }
            }
        }));
        this.id_double = this.id_class((LZ)new mU_2(this, n2, 100, 150, 20, new rgn_3("options.difficulty"), lF -> {
            this.id_interface = this.id_throw = this.id_throw.id_protected();
        }));
        this.B = this.id_class((LZ)new me_3(this, n, 151, 150, 20, new rgn_3("selectWorld.allowCommands"), lF -> {
            this.id_abstract = true;
            this.id_char = !this.id_char;
        }));
        this.P = this.id_class((LZ)new LF(n2, 151, 150, 20, new rgn_3("selectWorld.dataPacks"), lF -> this.id_long()));
        this.r = this.id_class((LZ)new LF(n, 185, 150, 20, new rgn_3("selectWorld.gameRules"), lF -> this.id_volatile.id_break(new ZJ(this.G.id_break(), optional -> {
            this.id_volatile.id_break(this);
            optional.ifPresent(rRu_12 -> {
                this.G = rRu_12;
            });
        }))));
        this.id_case.id_class(this, this.id_volatile, this.id_super);
        this.id_switch = this.id_class((LZ)new LF(n2, 185, 150, 20, new rgn_3("selectWorld.moreWorldOptions"), lF -> this.id_char()));
        this.id_transient = this.id_class((LZ)new LF(n, this.id_int - 28, 150, 20, new rgn_3("selectWorld.create"), lF -> this.id_interface()));
        this.id_transient.id_int = !this.E.isEmpty();
        this.id_class((LZ)new LF(n2, this.id_int - 28, 150, 20, cN_2.id_protected, lF -> this.id_native()));
        this.id_finally();
        this.id_break(this.id_goto);
        this.id_class(this.id_try);
        this.id_int();
    }

    @Override
    public void w_() {
        super.w_();
        ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
    }
}

