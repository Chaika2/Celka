package celestial;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum If_1 implements Ix_1 {
   X0_Y0(0, 0),
   X0_Y90(0, 90),
   X0_Y180(0, 180),
   X0_Y270(0, 270),
   X90_Y0(90, 0),
   X90_Y90(90, 90),
   X90_Y180(90, 180),
   X90_Y270(90, 270),
   X180_Y0(180, 0),
   X180_Y90(180, 90),
   X180_Y180(180, 180),
   X180_Y270(180, 270),
   X270_Y0(270, 0),
   X270_Y90(270, 90),
   X270_Y180(270, 180),
   X270_Y270(270, 270);

   private static final Map<Integer, If_1> MAP_ROTATIONS = Arrays.stream(values()).collect(Collectors.toMap(var0 -> var0.combinedXY, var0 -> (If_1)var0));
   private final rjo_3 transformation;
   private final rjg_3 orientation;
   private final int combinedXY;

   private If_1(int var3, int var4) {
      this.combinedXY = break_(var3, var4);
      rjY_2 var5 = new rjY_2(new rje_3(0.0F, 1.0F, 0.0F), (float)(-var4), true);
      var5.class_(new rjY_2(new rje_3(1.0F, 0.0F, 0.0F), (float)(-var3), true));
      rjg_3 var6 = rjg_3.IDENTITY;

      for (byte var7 = 0; var7 < var4; var7 += 90) {
         var6 = var6.class_(rjg_3.ROT_90_Y_NEG);
      }

      for (byte var8 = 0; var8 < var3; var8 += 90) {
         var6 = var6.class_(rjg_3.ROT_90_X_NEG);
      }

      this.transformation = new rjo_3((rje_3)null, var5, (rje_3)null, (rjY_2)null);
      this.orientation = var6;
   }

   public static If_1 class_(int var0, int var1) {
      return MAP_ROTATIONS.get(break_(rfU_2.break_(var0, 360), rfU_2.break_(var1, 360)));
   }

   @Override
   public rjo_3 class_() {
      return this.transformation;
   }

   private static int break_(int var0, int var1) {
      return var0 * 360 + var1;
   }
}
