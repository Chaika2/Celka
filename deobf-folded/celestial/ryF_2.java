package celestial;

public enum ryF_2 {
   NONE,
   FORWARD,
   BACKWARD;

   public static final rpB_2[] AXES = rpB_2.values();
   public static final ryF_2[] AXIS_ROTATIONS = values();

   public abstract rpB_2 id_class(rpB_2 var1);

   public static ryF_2 id_class(rpB_2 var0, rpB_2 var1) {
      return AXIS_ROTATIONS[Math.floorMod(var1.ordinal() - var0.ordinal(), 3)];
   }

   public abstract ryF_2 id_class();

   public abstract int id_class(int var1, int var2, int var3, rpB_2 var4);
}
