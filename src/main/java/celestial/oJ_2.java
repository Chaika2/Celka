/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.gp_3;
import celestial.gy_3;
import celestial.rgn_3;
import celestial.rnW_2;
import celestial.rqu_3;
import com.google.common.collect.ImmutableMap;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.spi.FileSystemProvider;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class oJ_2 {
    private static final Logger id_class = LogManager.getLogger();
    private static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType((Message)new rgn_3("commands.debug.notRunning"));
    private static final SimpleCommandExceptionType id_byte = new SimpleCommandExceptionType((Message)new rgn_3("commands.debug.alreadyRunning"));
    private static final FileSystemProvider id_protected = FileSystemProvider.installedProviders().stream().filter(fileSystemProvider -> fileSystemProvider.getScheme().equalsIgnoreCase("jar")).findFirst().orElse(null);

    private static int id_byte(gy_3 gy_32) {
        rnW_2 rnW_22 = gy_32.id_super();
        String string = "debug-report-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date());
        try {
            Path path = rnW_22.id_protected("debug").toPath();
            Files.createDirectories(path, new FileAttribute[0]);
            if (!rqu_3.id_byte && id_protected != null) {
                Path path2 = path.resolve(string + ".zip");
                try (FileSystem fileSystem = id_protected.newFileSystem(path2, (Map<String, ?>)ImmutableMap.of((Object)"create", (Object)"true"));){
                    rnW_22.id_class(fileSystem.getPath("/", new String[0]));
                }
            } else {
                Path path3 = path.resolve(string);
                rnW_22.id_class(path3);
            }
            gy_32.id_class(new rgn_3("commands.debug.reportSaved", string), false);
            return 1;
        }
        catch (IOException iOException) {
            id_class.error("Failed to save debug dump", (Throwable)iOException);
            gy_32.id_class(new rgn_3("commands.debug.reportFailed"));
            return 0;
        }
    }

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("debug").requires(gy_32 -> gy_32.id_class(3))).then(gp_3.id_class("start").executes(commandContext -> oJ_2.id_class((gy_3)commandContext.getSource())))).then(gp_3.id_class("stop").executes(commandContext -> oJ_2.id_break((gy_3)commandContext.getSource())))).then(gp_3.id_class("report").executes(commandContext -> oJ_2.id_byte((gy_3)commandContext.getSource()))));
    }

    private static int id_class(gy_3 gy_32) {
        return 0;
    }

    private static int id_break(gy_3 gy_32) {
        return 0;
    }
}

