package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;

public class rrdW {
   public static final int class_ = 18;
   public static final int break_ = 8;
   public static final int byte_ = 9;
   public static final int protected_ = 11;
   public static final int throws_ = 13;
   public static final int case_ = 15;
   public static final jv_3 catch_ = class_("SHADERS_MIDOFFSET_3B", 0, jF_2.BYTE, jL_2.PADDING, 3);
   public static final jv_3 private_ = class_("PADDING_1B", 0, jF_2.BYTE, jL_2.PADDING, 1);
   public static final jv_3 implements_ = class_("SHADERS_MIDTEXCOORD_2F", 0, jF_2.FLOAT, jL_2.PADDING, 2);
   public static final jv_3 finally_ = class_("SHADERS_TANGENT_4S", 0, jF_2.SHORT, jL_2.PADDING, 4);
   public static final jv_3 extends_ = class_("SHADERS_MC_ENTITY_4S", 0, jF_2.SHORT, jL_2.PADDING, 4);
   public static final jv_3 native_ = class_("SHADERS_VELOCITY_3F", 0, jF_2.FLOAT, jL_2.PADDING, 3);

   public static jZ_2 class_(jZ_2 var0) {
      Builder var1 = ImmutableList.builder();
      var1.addAll(var0.byte_());
      var1.add(catch_);
      var1.add(private_);
      var1.add(implements_);
      var1.add(finally_);
      var1.add(extends_);
      var1.add(native_);
      return new jZ_2(var1.build());
   }

   private static jv_3 class_(String var0, int var1, jF_2 var2, jL_2 var3, int var4) {
      jv_3 var5 = new jv_3(var1, var2, var3, var4);
      var5.class_(var0);
      return var5;
   }

   public static jZ_2 break_(jZ_2 var0) {
      Builder var1 = ImmutableList.builder();
      var1.addAll(var0.byte_());
      var1.add(implements_);
      var1.add(finally_);
      var1.add(extends_);
      var1.add(native_);
      return new jZ_2(var1.build());
   }
}
