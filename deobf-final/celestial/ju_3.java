package celestial;

import com.google.common.collect.ImmutableList;

public class ju_3 {
   public static final jv_3 class_ = new jv_3(0, jF_2.FLOAT, jL_2.POSITION, 3);
   public static final jv_3 break_ = new jv_3(0, jF_2.UBYTE, jL_2.COLOR, 4);
   public static final jv_3 byte_ = new jv_3(0, jF_2.FLOAT, jL_2.UV, 2);
   public static final jv_3 protected_ = new jv_3(1, jF_2.SHORT, jL_2.UV, 2);
   public static final jv_3 throws_ = new jv_3(2, jF_2.SHORT, jL_2.UV, 2);
   public static final jv_3 case_ = new jv_3(0, jF_2.BYTE, jL_2.NORMAL, 3);
   public static final jv_3 catch_ = new jv_3(0, jF_2.BYTE, jL_2.PADDING, 1);
   public static final jZ_2 private_ = new jZ_2(ImmutableList.builder().add(class_).add(break_).add(byte_).add(throws_).add(case_).add(catch_).build());
   public static final jZ_2 implements_ = new jZ_2(
      ImmutableList.builder().add(class_).add(break_).add(byte_).add(protected_).add(throws_).add(case_).add(catch_).build()
   );
   public static final jZ_2 finally_ = private_.native_();
   public static final jZ_2 extends_ = rrdW.class_(finally_);
   public static final int native_ = finally_.break_();
   public static final int volatile_ = extends_.break_();
   public static final jZ_2 final_ = implements_.native_();
   public static final jZ_2 package_ = rrdW.break_(final_);
   public static final int int_ = final_.break_();
   public static final int new_ = package_.break_();
   @Deprecated
   public static final jZ_2 continue_ = new jZ_2(ImmutableList.builder().add(class_).add(byte_).add(break_).add(throws_).build());
   public static final jZ_2 super_ = new jZ_2(ImmutableList.builder().add(class_).build());
   public static final jZ_2 this_ = new jZ_2(ImmutableList.builder().add(class_).add(break_).build());
   public static final jZ_2 else_ = new jZ_2(ImmutableList.builder().add(class_).add(break_).add(throws_).build());
   public static final jZ_2 synchronized_ = new jZ_2(ImmutableList.builder().add(class_).add(byte_).build());
   public static final jZ_2 return_ = new jZ_2(ImmutableList.builder().add(class_).add(break_).add(byte_).build());
   @Deprecated
   public static final jZ_2 public_ = new jZ_2(ImmutableList.builder().add(class_).add(byte_).add(break_).build());
   public static final jZ_2 goto_ = new jZ_2(ImmutableList.builder().add(class_).add(break_).add(byte_).add(throws_).build());
   @Deprecated
   public static final jZ_2 while_ = new jZ_2(ImmutableList.builder().add(class_).add(byte_).add(throws_).add(break_).build());
   @Deprecated
   public static final jZ_2 try_ = new jZ_2(ImmutableList.builder().add(class_).add(byte_).add(break_).add(case_).add(catch_).build());

   static {
      class_.class_("POSITION_3F");
      break_.class_("COLOR_4UB");
      byte_.class_("TEX_2F");
      protected_.class_("TEX_2S");
      throws_.class_("TEX_2SB");
      case_.class_("NORMAL_3B");
      catch_.class_("PADDING_1B");
      private_.class_("BLOCK");
      implements_.class_("ENTITY");
      extends_.class_("BLOCK_SHADERS");
      package_.class_("ENTITY_SHADERS");
      continue_.class_("PARTICLE_POSITION_TEX_COLOR_LMAP");
      super_.class_("POSITION");
      this_.class_("POSITION_COLOR");
      else_.class_("POSITION_COLOR_LIGHTMAP");
      synchronized_.class_("POSITION_TEX");
      return_.class_("POSITION_COLOR_TEX");
      public_.class_("POSITION_TEX_COLOR");
      goto_.class_("POSITION_COLOR_TEX_LIGHTMAP");
      while_.class_("POSITION_TEX_LIGHTMAP_COLOR");
      try_.class_("POSITION_TEX_COLOR_NORMAL");
   }

   public static void class_() {
      if (rrbb_3.rs()) {
         private_.class_(extends_);
         implements_.class_(package_);
      } else {
         private_.class_(finally_);
         implements_.class_(final_);
      }
   }
}
