/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 */
package celestial;

import celestial.rtU_2;
import com.mojang.datafixers.schemas.Schema;
import java.util.function.Function;

public class rte_3
extends rtU_2 {
    public final /* synthetic */ Function id_class;

    public rte_3(Schema schema, String string, Function function) {
        this.id_class = function;
        super(schema, string);
    }

    @Override
    protected String id_class(String string) {
        return (String)this.id_class.apply(string);
    }
}

