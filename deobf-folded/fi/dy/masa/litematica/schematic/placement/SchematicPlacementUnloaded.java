package fi.dy.masa.litematica.schematic.placement;

import celestial.rfH_2;
import java.io.File;
import javax.annotation.Nullable;

public class SchematicPlacementUnloaded {
   protected String name = "?";
   @Nullable
   protected File schematicFile;
   protected rfH_2 origin = rfH_2.id_protected;

   public String getName() {
      return this.name;
   }

   @Nullable
   public File getSchematicFile() {
      return this.schematicFile;
   }

   public rfH_2 getOrigin() {
      return this.origin;
   }
}
