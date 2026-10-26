package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum rqd_3 {
   NONE(rjg_3.IDENTITY),
   CLOCKWISE_90(rjg_3.ROT_90_Y_NEG),
   CLOCKWISE_180(rjg_3.ROT_180_FACE_XZ),
   COUNTERCLOCKWISE_90(rjg_3.ROT_90_Y_POS);

   private final rjg_3 orientation;

   private rqd_3(rjg_3 var3) {
      this.orientation = var3;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int class_(int var1, int var2) {
      switch (this) {
         case CLOCKWISE_90:
            return (var1 + var2 / 4) % var2;
         case CLOCKWISE_180:
            return (var1 + var2 / 2) % var2;
         case COUNTERCLOCKWISE_90:
            return (var1 + var2 * 3 / 4) % var2;
         default:
            return var1;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public rpr_3 class_(rpr_3 var1) {
      if (var1.final_() == rpB_2.Y) {
         return var1;
      } else {
         switch (this) {
            case CLOCKWISE_90:
               return var1.catch_();
            case CLOCKWISE_180:
               return var1.case_();
            case COUNTERCLOCKWISE_90:
               return var1.private_();
            default:
               return var1;
         }
      }
   }

   public static rqd_3 class_(Random var0) {
      return rqR_2.class_(values(), var0);
   }

   public rqd_3 class_(rqd_3 var1) {
      switch (var1) {
         case CLOCKWISE_180:
            switch (this) {
               case NONE:
                  return CLOCKWISE_180;
               case CLOCKWISE_90:
                  return COUNTERCLOCKWISE_90;
               case CLOCKWISE_180:
                  return NONE;
               case COUNTERCLOCKWISE_90:
                  return CLOCKWISE_90;
            }
         case COUNTERCLOCKWISE_90:
            switch (this) {
               case NONE:
                  return COUNTERCLOCKWISE_90;
               case CLOCKWISE_90:
                  return NONE;
               case CLOCKWISE_180:
                  return CLOCKWISE_90;
               case COUNTERCLOCKWISE_90:
                  return CLOCKWISE_180;
            }
         case CLOCKWISE_90:
            switch (this) {
               case NONE:
                  return CLOCKWISE_90;
               case CLOCKWISE_90:
                  return CLOCKWISE_180;
               case CLOCKWISE_180:
                  return COUNTERCLOCKWISE_90;
               case COUNTERCLOCKWISE_90:
                  return NONE;
            }
         default:
            return this;
      }
   }

   public rjg_3 class_() {
      return this.orientation;
   }

   public static List<rqd_3> break_(Random var0) {
      ArrayList var1 = Lists.newArrayList(values());
      Collections.shuffle(var1, var0);
      return var1;
   }
}
