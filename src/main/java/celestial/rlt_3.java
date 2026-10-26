/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  org.apache.commons.io.IOUtils
 */
package celestial;

import celestial.DU;
import celestial.Rd_1;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rHr_1;
import celestial.rKv_1;
import celestial.rVi_1;
import celestial.rcH_2;
import celestial.rcW_2;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rff_3;
import celestial.rfl_3;
import celestial.rgF_2;
import celestial.rgH_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgc_3;
import celestial.rgl_3;
import celestial.rgp_3;
import celestial.rgy_3;
import celestial.rlH_2;
import celestial.rlR_2;
import celestial.rlT_2;
import celestial.rlY_2;
import celestial.rle_3;
import celestial.rli_3;
import celestial.rlj_3;
import celestial.rlw_3;
import celestial.rly_3;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rqd_3;
import celestial.rrEm_1;
import celestial.ruP_2;
import celestial.ryG_2;
import celestial.xd_3;
import celestial.xu_3;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.apache.commons.io.IOUtils;

public class rlt_3 {
    private static int id_byte(gy_3 gy_32, String string) {
        Path path = Paths.get(rlH_2.id_class, new String[0]);
        rqO_2 rqO_22 = new rqO_2("minecraft", string);
        Path path2 = gy_32.id_final().O().id_class(rqO_22, ".nbt");
        Path path3 = DU.id_class(path2, string, path);
        if (path3 == null) {
            rlt_3.id_break(gy_32, "Failed to export " + path2);
            return 1;
        }
        try {
            Files.createDirectories(path3.getParent(), new FileAttribute[0]);
        }
        catch (IOException iOException) {
            rlt_3.id_break(gy_32, "Could not create folder " + path3.getParent());
            iOException.printStackTrace();
            return 1;
        }
        rlt_3.id_break(gy_32, "Exported " + string + " to " + path3.toAbsolutePath());
        return 0;
    }

    private static int id_byte(gy_3 gy_32) {
        rrEm_1 rrEm_12;
        rfH_2 rfH_22 = new rfH_2(gy_32.id_volatile());
        rfH_2 rfH_23 = rlH_2.id_break(rfH_22, 15, rrEm_12 = gy_32.id_final());
        if (rfH_23 == null) {
            rlt_3.id_class(rrEm_12, "Couldn't find any structure block within 15 radius", rgF_2.RED);
            return 0;
        }
        ryG_2 ryG_22 = (ryG_2)rrEm_12.id_class(rfH_23);
        String string = ryG_22.id_catch();
        return rlt_3.id_byte(gy_32, string);
    }

    private static void id_class(rrEm_1 rrEm_12, String string, rgF_2 rgF_22) {
        rrEm_12.id_class(rhN_22 -> true).forEach(rhN_22 -> rhN_22.id_class((rgP_2)new rgN_2(rgF_22 + string), rqR_2.id_break));
    }

    private static void id_class(gy_3 gy_32, Collection<rlj_3> collection, int n, int n2) {
        rfH_2 rfH_22 = new rfH_2(gy_32.id_volatile());
        rfH_2 rfH_23 = new rfH_2(rfH_22.b_(), gy_32.id_final().id_class(rKv_1.WORLD_SURFACE, rfH_22).c_(), rfH_22.d_() + 3);
        rrEm_1 rrEm_12 = gy_32.id_final();
        rqd_3 rqd_32 = rlH_2.id_class(n);
        Collection<rle_3> collection2 = rHr_1.id_break(collection, rfH_23, rqd_32, rrEm_12, rlT_2.id_class, n2);
        rlY_2 rlY_22 = new rlY_2(collection2);
        rlY_22.id_class(new rlw_3(rrEm_12, rlY_22));
        rlY_22.id_class(rle_32 -> rlR_2.id_class(rle_32.id_package()));
    }

    private static int id_class(gy_3 gy_32, boolean bl, int n, int n2) {
        Collection collection = bl ? (Collection)rlR_2.id_byte().stream().filter(rlj_3::id_protected).collect(Collectors.toList()) : rlR_2.id_byte();
        if (collection.isEmpty()) {
            rlt_3.id_break(gy_32, "No failed tests to rerun");
            return 0;
        }
        rHr_1.id_class(gy_32.id_final());
        rlt_3.id_break(gy_32, "Rerunning " + collection.size() + " failed tests (" + (bl ? "only required tests" : "including optional tests") + ")");
        rlt_3.id_class(gy_32, collection, n, n2);
        return 1;
    }

    private static int id_class(gy_3 gy_32) {
        rrEm_1 rrEm_12;
        rfH_2 rfH_22 = new rfH_2(gy_32.id_volatile());
        rfH_2 rfH_23 = rlH_2.id_break(rfH_22, 15, rrEm_12 = gy_32.id_final());
        if (rfH_23 == null) {
            rlt_3.id_class(rrEm_12, "Couldn't find any structure block within 15 radius", rgF_2.RED);
            return 0;
        }
        rHr_1.id_class(rrEm_12);
        rlt_3.id_class(rrEm_12, rfH_23, (rlY_2)null);
        return 1;
    }

    private static void id_class(rrEm_1 rrEm_12, rfH_2 rfH_22, rlY_2 rlY_22) {
        ryG_2 ryG_22 = (ryG_2)rrEm_12.id_class(rfH_22);
        String string = ryG_22.id_catch();
        rlj_3 rlj_32 = rlR_2.id_throws(string);
        rle_3 rle_32 = new rle_3(rlj_32, ryG_22.id_volatile(), rrEm_12);
        if (rlY_22 != null) {
            rlY_22.id_class(rle_32);
            rle_32.id_class(new rlw_3(rrEm_12, rlY_22));
        }
        rlt_3.id_class(rlj_32, rrEm_12);
        rfl_3 rfl_32 = rlH_2.id_class(ryG_22);
        rfH_2 rfH_23 = new rfH_2(rfl_32.id_class, rfl_32.id_break, rfl_32.id_byte);
        rHr_1.id_class(rle_32, rfH_23, rlT_2.id_class);
    }

    public static void id_class(rrEm_1 rrEm_12, rlY_2 rlY_22) {
        if (rlY_22.id_catch()) {
            rlt_3.id_class(rrEm_12, "GameTest done! " + rlY_22.id_case() + " tests were run", rgF_2.WHITE);
            if (rlY_22.id_protected()) {
                rlt_3.id_class(rrEm_12, rlY_22.id_class() + " required tests failed :(", rgF_2.RED);
            } else {
                rlt_3.id_class(rrEm_12, "All required tests passed :)", rgF_2.GREEN);
            }
            if (rlY_22.id_throws()) {
                rlt_3.id_class(rrEm_12, rlY_22.id_break() + " optional tests failed", rgF_2.GRAY);
            }
        }
    }

    private static int id_class(gy_3 gy_32, int n) {
        rrEm_1 rrEm_12 = gy_32.id_final();
        rHr_1.id_class(rrEm_12);
        rfH_2 rfH_22 = new rfH_2(gy_32.id_volatile().id_break, (double)gy_32.id_final().id_class(rKv_1.WORLD_SURFACE, new rfH_2(gy_32.id_volatile())).c_(), gy_32.id_volatile().id_protected);
        rHr_1.id_class(rrEm_12, rfH_22, rlT_2.id_class, rfU_2.id_class(n, 0, 1024));
        return 1;
    }

    private static int id_class(gy_3 gy_32, String string) throws CommandSyntaxException {
        rrEm_1 rrEm_12;
        rff_3 rff_32 = (rff_3)gy_32.id_new().id_break(10.0, 1.0f, false);
        rfH_2 rfH_22 = rff_32.id_class();
        Optional<rfH_2> optional = rlH_2.id_class(rfH_22, 15, rrEm_12 = gy_32.id_final());
        if (!optional.isPresent()) {
            optional = rlH_2.id_class(rfH_22, 200, rrEm_12);
        }
        if (!optional.isPresent()) {
            gy_32.id_class(new rgN_2("Can't find a structure block that contains the targeted pos " + rfH_22));
            return 0;
        }
        ryG_2 ryG_22 = (ryG_2)rrEm_12.id_class(optional.get());
        rfH_2 rfH_23 = rfH_22.id_byte(optional.get());
        String string2 = rfH_23.b_() + ", " + rfH_23.c_() + ", " + rfH_23.d_();
        String string3 = ryG_22.id_catch();
        rVi_1 rVi_12 = new rgN_2(string2).id_class(rgc_3.id_class.id_class(true).id_class(rgF_2.GREEN).id_class(new rgy_3(rgp_3.id_class, new rgN_2("Click to copy to clipboard"))).id_class(new rgl_3(rgH_2.COPY_TO_CLIPBOARD, "final BlockPos " + string + " = new BlockPos(" + string2 + ");")));
        gy_32.id_class(new rgN_2("Position relative to " + string3 + ": ").id_class(rVi_12), false);
        ruP_2.id_class(rrEm_12, new rfH_2(rfH_22), string2, -2147418368, 10000);
        return 1;
    }

    private static int id_class(gy_3 gy_32, String string, int n, int n2, int n3) {
        if (n <= 48 && n2 <= 48 && n3 <= 48) {
            rrEm_1 rrEm_12 = gy_32.id_final();
            rfH_2 rfH_22 = new rfH_2(gy_32.id_volatile());
            rfH_2 rfH_23 = new rfH_2(rfH_22.b_(), gy_32.id_final().id_class(rKv_1.WORLD_SURFACE, rfH_22).c_(), rfH_22.d_() + 3);
            rlH_2.id_class(string.toLowerCase(), rfH_23, new rfH_2(n, n2, n3), rqd_3.NONE, rrEm_12);
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n3; ++j) {
                    rfH_2 rfH_24 = new rfH_2(rfH_23.b_() + i, rfH_23.c_() + 1, rfH_23.d_() + j);
                    xd_3 xd_32 = xu_3.id_private;
                    Rd_1 rd_1 = new Rd_1(xd_32.id_continue(), Collections.EMPTY_SET, null);
                    rd_1.id_class(rrEm_12, rfH_24, 2);
                }
            }
            rlH_2.id_class(rfH_23, new rfH_2(1, 0, -1), rqd_3.NONE, rrEm_12);
            return 0;
        }
        throw new IllegalArgumentException("The structure must be less than 48 blocks big in each axis");
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("test").then(gp_3.id_class("runthis").executes(commandContext -> rlt_3.id_class((gy_3)commandContext.getSource())))).then(gp_3.id_class("runthese").executes(commandContext -> rlt_3.id_break((gy_3)commandContext.getSource())))).then(((LiteralArgumentBuilder)gp_3.id_class("runfailed").executes(commandContext -> rlt_3.id_class((gy_3)commandContext.getSource(), false, 0, 8))).then(((RequiredArgumentBuilder)gp_3.id_class("onlyRequiredTests", BoolArgumentType.bool()).executes(commandContext -> rlt_3.id_class((gy_3)commandContext.getSource(), BoolArgumentType.getBool((CommandContext)commandContext, (String)"onlyRequiredTests"), 0, 8))).then(((RequiredArgumentBuilder)gp_3.id_class("rotationSteps", IntegerArgumentType.integer()).executes(commandContext -> rlt_3.id_class((gy_3)commandContext.getSource(), BoolArgumentType.getBool((CommandContext)commandContext, (String)"onlyRequiredTests"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"rotationSteps"), 8))).then(gp_3.id_class("testsPerRow", IntegerArgumentType.integer()).executes(commandContext -> rlt_3.id_class((gy_3)commandContext.getSource(), BoolArgumentType.getBool((CommandContext)commandContext, (String)"onlyRequiredTests"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"rotationSteps"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"testsPerRow")))))))).then(gp_3.id_class("run").then(((RequiredArgumentBuilder)gp_3.id_class("testName", rly_3.id_class()).executes(commandContext -> rlt_3.id_class((gy_3)commandContext.getSource(), rly_3.id_class((CommandContext<gy_3>)commandContext, "testName"), 0))).then(gp_3.id_class("rotationSteps", IntegerArgumentType.integer()).executes(commandContext -> rlt_3.id_class((gy_3)commandContext.getSource(), rly_3.id_class((CommandContext<gy_3>)commandContext, "testName"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"rotationSteps"))))))).then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("runall").executes(commandContext -> rlt_3.id_class((gy_3)commandContext.getSource(), 0, 8))).then(((RequiredArgumentBuilder)gp_3.id_class("testClassName", rli_3.id_class()).executes(commandContext -> rlt_3.id_class((gy_3)commandContext.getSource(), rli_3.id_class((CommandContext<gy_3>)commandContext, "testClassName"), 0, 8))).then(((RequiredArgumentBuilder)gp_3.id_class("rotationSteps", IntegerArgumentType.integer()).executes(commandContext -> rlt_3.id_class((gy_3)commandContext.getSource(), rli_3.id_class((CommandContext<gy_3>)commandContext, "testClassName"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"rotationSteps"), 8))).then(gp_3.id_class("testsPerRow", IntegerArgumentType.integer()).executes(commandContext -> rlt_3.id_class((gy_3)commandContext.getSource(), rli_3.id_class((CommandContext<gy_3>)commandContext, "testClassName"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"rotationSteps"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"testsPerRow"))))))).then(((RequiredArgumentBuilder)gp_3.id_class("rotationSteps", IntegerArgumentType.integer()).executes(commandContext -> rlt_3.id_class((gy_3)commandContext.getSource(), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"rotationSteps"), 8))).then(gp_3.id_class("testsPerRow", IntegerArgumentType.integer()).executes(commandContext -> rlt_3.id_class((gy_3)commandContext.getSource(), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"rotationSteps"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"testsPerRow"))))))).then(gp_3.id_class("export").then(gp_3.id_class("testName", StringArgumentType.word()).executes(commandContext -> rlt_3.id_byte((gy_3)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"testName")))))).then(gp_3.id_class("exportthis").executes(commandContext -> rlt_3.id_byte((gy_3)commandContext.getSource())))).then(gp_3.id_class("import").then(gp_3.id_class("testName", StringArgumentType.word()).executes(commandContext -> rlt_3.id_protected((gy_3)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"testName")))))).then(((LiteralArgumentBuilder)gp_3.id_class("pos").executes(commandContext -> rlt_3.id_class((gy_3)commandContext.getSource(), "pos"))).then(gp_3.id_class("var", StringArgumentType.word()).executes(commandContext -> rlt_3.id_class((gy_3)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"var")))))).then(gp_3.id_class("create").then(((RequiredArgumentBuilder)gp_3.id_class("testName", StringArgumentType.word()).executes(commandContext -> rlt_3.id_class((gy_3)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"testName"), 5, 5, 5))).then(((RequiredArgumentBuilder)gp_3.id_class("width", IntegerArgumentType.integer()).executes(commandContext -> rlt_3.id_class((gy_3)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"testName"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"width"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"width"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"width")))).then(gp_3.id_class("height", IntegerArgumentType.integer()).then(gp_3.id_class("depth", IntegerArgumentType.integer()).executes(commandContext -> rlt_3.id_class((gy_3)commandContext.getSource(), StringArgumentType.getString((CommandContext)commandContext, (String)"testName"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"width"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"height"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"depth"))))))))).then(((LiteralArgumentBuilder)gp_3.id_class("clearall").executes(commandContext -> rlt_3.id_class((gy_3)commandContext.getSource(), 200))).then(gp_3.id_class("radius", IntegerArgumentType.integer()).executes(commandContext -> rlt_3.id_class((gy_3)commandContext.getSource(), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"radius"))))));
    }

    private static int id_class(gy_3 gy_32, String string, int n, int n2) {
        Collection<rlj_3> collection = rlR_2.id_class(string);
        rHr_1.id_class(gy_32.id_final());
        rlt_3.id_break(gy_32, "Running " + collection.size() + " tests from " + string + "...");
        rlR_2.id_protected();
        rlt_3.id_class(gy_32, collection, n, n2);
        return 1;
    }

    private static int id_class(gy_3 gy_32, int n, int n2) {
        rHr_1.id_class(gy_32.id_final());
        Collection<rlj_3> collection = rlR_2.id_class();
        rlt_3.id_break(gy_32, "Running all " + collection.size() + " tests...");
        rlR_2.id_protected();
        rlt_3.id_class(gy_32, collection, n, n2);
        return 1;
    }

    private static void id_class(rlj_3 rlj_32, rrEm_1 rrEm_12) {
        Consumer<rrEm_1> consumer = rlR_2.id_byte(rlj_32.id_throws());
        if (consumer != null) {
            consumer.accept(rrEm_12);
        }
    }

    private static int id_class(gy_3 gy_32, rlj_3 rlj_32, int n) {
        rrEm_1 rrEm_12 = gy_32.id_final();
        rfH_2 rfH_22 = new rfH_2(gy_32.id_volatile());
        int n2 = gy_32.id_final().id_class(rKv_1.WORLD_SURFACE, rfH_22).c_();
        rfH_2 rfH_23 = new rfH_2(rfH_22.b_(), n2, rfH_22.d_() + 3);
        rHr_1.id_class(rrEm_12);
        rlt_3.id_class(rlj_32, rrEm_12);
        rqd_3 rqd_32 = rlH_2.id_class(n);
        rle_3 rle_32 = new rle_3(rlj_32, rqd_32, rrEm_12);
        rHr_1.id_class(rle_32, rfH_23, rlT_2.id_class);
        return 1;
    }

    private static void id_break(gy_3 gy_32, String string) {
        gy_32.id_class(new rgN_2(string), false);
    }

    private static int id_break(gy_3 gy_32) {
        rrEm_1 rrEm_12;
        rfH_2 rfH_23 = new rfH_2(gy_32.id_volatile());
        Collection<rfH_2> collection = rlH_2.id_byte(rfH_23, 200, rrEm_12 = gy_32.id_final());
        if (collection.isEmpty()) {
            rlt_3.id_class(rrEm_12, "Couldn't find any structure blocks within 200 block radius", rgF_2.RED);
            return 1;
        }
        rHr_1.id_class(rrEm_12);
        rlt_3.id_break(gy_32, "Running " + collection.size() + " tests...");
        rlY_2 rlY_22 = new rlY_2();
        collection.forEach(rfH_22 -> rlt_3.id_class(rrEm_12, rfH_22, rlY_22));
        return 1;
    }

    private static int id_protected(gy_3 gy_32, String string) {
        Path path = Paths.get(rlH_2.id_class, string + ".snbt");
        rqO_2 rqO_22 = new rqO_2("minecraft", string);
        Path path2 = gy_32.id_final().O().id_class(rqO_22, ".nbt");
        try {
            BufferedReader bufferedReader = Files.newBufferedReader(path);
            String string2 = IOUtils.toString((Reader)bufferedReader);
            Files.createDirectories(path2.getParent(), new FileAttribute[0]);
            try (OutputStream outputStream = Files.newOutputStream(path2, new OpenOption[0]);){
                rcW_2.id_class(rcH_2.id_class(string2), outputStream);
            }
            rlt_3.id_break(gy_32, "Imported to " + path2.toAbsolutePath());
            return 0;
        }
        catch (CommandSyntaxException | IOException throwable) {
            System.err.println("Failed to load structure " + string);
            throwable.printStackTrace();
            return 1;
        }
    }
}

