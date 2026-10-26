package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;

public class rrdW {
   public static final int id_class = 18;
   public static final int id_break = 8;
   public static final int id_byte = 9;
   public static final int id_protected = 11;
   public static final int id_throws = 13;
   public static final int id_case = 15;
   public static final jv_3 id_catch = id_class("SHADERS_MIDOFFSET_3B", 0, jF_2.BYTE, jL_2.PADDING, 3);
   public static final jv_3 id_private = id_class("PADDING_1B", 0, jF_2.BYTE, jL_2.PADDING, 1);
   public static final jv_3 id_implements = id_class("SHADERS_MIDTEXCOORD_2F", 0, jF_2.FLOAT, jL_2.PADDING, 2);
   public static final jv_3 id_finally = id_class("SHADERS_TANGENT_4S", 0, jF_2.SHORT, jL_2.PADDING, 4);
   public static final jv_3 id_extends = id_class("SHADERS_MC_ENTITY_4S", 0, jF_2.SHORT, jL_2.PADDING, 4);
   public static final jv_3 id_native = id_class("SHADERS_VELOCITY_3F", 0, jF_2.FLOAT, jL_2.PADDING, 3);

   public static jZ_2 id_class(jZ_2 var0) {
      Builder var1 = ImmutableList.builder();
      var1.addAll(var0.id_byte());
      var1.add(id_catch);
      var1.add(id_private);
      var1.add(id_implements);
      var1.add(id_finally);
      var1.add(id_extends);
      var1.add(id_native);
      return new jZ_2(var1.build());
   }

   private static jv_3 id_class(String var0, int var1, jF_2 var2, jL_2 var3, int var4) {
      jv_3 var5 = new jv_3(var1, var2, var3, var4);
      var5.id_class(var0);
      return var5;
   }

   public static jZ_2 id_break(jZ_2 var0) {
      Builder var1 = ImmutableList.builder();
      var1.addAll(var0.id_byte());
      var1.add(id_implements);
      var1.add(id_finally);
      var1.add(id_extends);
      var1.add(id_native);
      return new jZ_2(var1.build());
   }
}
