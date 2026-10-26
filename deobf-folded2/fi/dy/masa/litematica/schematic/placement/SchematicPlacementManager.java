package fi.dy.masa.litematica.schematic.placement;

import java.util.ArrayList;
import java.util.List;

public class SchematicPlacementManager {
   private final List<SchematicPlacement> schematicPlacements = new ArrayList<>();

   public List<SchematicPlacement> getAllSchematicsPlacements() {
      return this.schematicPlacements;
   }
}
