package fi.dy.masa.litematica.schematic.placement;

import celestial.rpa_3;
import celestial.rqd_3;

public class SchematicPlacement extends SchematicPlacementUnloaded {
   private rqd_3 rotation;
   private rpa_3 mirror;

   public rpa_3 getMirror() {
      return this.mirror;
   }

   public rqd_3 getRotation() {
      return this.rotation;
   }
}
