/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.mojang.brigadier.CommandDispatcher
 */
package celestial;

import celestial.DA;
import celestial.DT;
import celestial.Dn_1;
import celestial.RG;
import celestial.gp_3;
import celestial.gq_3;
import celestial.gy_3;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.mojang.brigadier.CommandDispatcher;
import java.io.IOException;
import java.nio.file.Path;

public class Dm_1
implements DT {
    private static final Gson id_break = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    private final DA id_byte;

    public Dm_1(DA dA) {
        this.id_byte = dA;
    }

    @Override
    public void id_class(Dn_1 dn_1) throws IOException {
        Path path = this.id_byte.id_break().resolve("reports/commands.json");
        CommandDispatcher<gy_3> commandDispatcher = new gp_3(gq_3.ALL).id_class();
        DT.id_class(id_break, dn_1, (JsonElement)RG.id_class(commandDispatcher, commandDispatcher.getRoot()), path);
    }

    @Override
    public String id_class() {
        return "Command Syntax";
    }
}

