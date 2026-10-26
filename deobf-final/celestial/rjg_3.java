package celestial;

import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.booleans.BooleanArrayList;
import it.unimi.dsi.fastutil.booleans.BooleanList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum rjg_3 implements rpH_2 {
   IDENTITY("identity", rqf_3.P123, false, false, false),
   ROT_180_FACE_XY("rot_180_face_xy", rqf_3.P123, true, true, false),
   ROT_180_FACE_XZ("rot_180_face_xz", rqf_3.P123, true, false, true),
   ROT_180_FACE_YZ("rot_180_face_yz", rqf_3.P123, false, true, true),
   ROT_120_NNN("rot_120_nnn", rqf_3.P231, false, false, false),
   ROT_120_NNP("rot_120_nnp", rqf_3.P312, true, false, true),
   ROT_120_NPN("rot_120_npn", rqf_3.P312, false, true, true),
   ROT_120_NPP("rot_120_npp", rqf_3.P231, true, false, true),
   ROT_120_PNN("rot_120_pnn", rqf_3.P312, true, true, false),
   ROT_120_PNP("rot_120_pnp", rqf_3.P231, true, true, false),
   ROT_120_PPN("rot_120_ppn", rqf_3.P231, false, true, true),
   ROT_120_PPP("rot_120_ppp", rqf_3.P312, false, false, false),
   ROT_180_EDGE_XY_NEG("rot_180_edge_xy_neg", rqf_3.P213, true, true, true),
   ROT_180_EDGE_XY_POS("rot_180_edge_xy_pos", rqf_3.P213, false, false, true),
   ROT_180_EDGE_XZ_NEG("rot_180_edge_xz_neg", rqf_3.P321, true, true, true),
   ROT_180_EDGE_XZ_POS("rot_180_edge_xz_pos", rqf_3.P321, false, true, false),
   ROT_180_EDGE_YZ_NEG("rot_180_edge_yz_neg", rqf_3.P132, true, true, true),
   ROT_180_EDGE_YZ_POS("rot_180_edge_yz_pos", rqf_3.P132, true, false, false),
   ROT_90_X_NEG("rot_90_x_neg", rqf_3.P132, false, false, true),
   ROT_90_X_POS("rot_90_x_pos", rqf_3.P132, false, true, false),
   ROT_90_Y_NEG("rot_90_y_neg", rqf_3.P321, true, false, false),
   ROT_90_Y_POS("rot_90_y_pos", rqf_3.P321, false, false, true),
   ROT_90_Z_NEG("rot_90_z_neg", rqf_3.P213, false, true, false),
   ROT_90_Z_POS("rot_90_z_pos", rqf_3.P213, true, false, false),
   INVERSION("inversion", rqf_3.P123, true, true, true),
   INVERT_X("invert_x", rqf_3.P123, true, false, false),
   INVERT_Y("invert_y", rqf_3.P123, false, true, false),
   INVERT_Z("invert_z", rqf_3.P123, false, false, true),
   ROT_60_REF_NNN("rot_60_ref_nnn", rqf_3.P312, true, true, true),
   ROT_60_REF_NNP("rot_60_ref_nnp", rqf_3.P231, true, false, false),
   ROT_60_REF_NPN("rot_60_ref_npn", rqf_3.P231, false, false, true),
   ROT_60_REF_NPP("rot_60_ref_npp", rqf_3.P312, false, false, true),
   ROT_60_REF_PNN("rot_60_ref_pnn", rqf_3.P231, false, true, false),
   ROT_60_REF_PNP("rot_60_ref_pnp", rqf_3.P312, true, false, false),
   ROT_60_REF_PPN("rot_60_ref_ppn", rqf_3.P312, false, true, false),
   ROT_60_REF_PPP("rot_60_ref_ppp", rqf_3.P231, true, true, true),
   SWAP_XY("swap_xy", rqf_3.P213, false, false, false),
   SWAP_YZ("swap_yz", rqf_3.P132, false, false, false),
   SWAP_XZ("swap_xz", rqf_3.P321, false, false, false),
   SWAP_NEG_XY("swap_neg_xy", rqf_3.P213, true, true, false),
   SWAP_NEG_YZ("swap_neg_yz", rqf_3.P132, false, true, true),
   SWAP_NEG_XZ("swap_neg_xz", rqf_3.P321, true, false, true),
   ROT_90_REF_X_NEG("rot_90_ref_x_neg", rqf_3.P132, true, false, true),
   ROT_90_REF_X_POS("rot_90_ref_x_pos", rqf_3.P132, true, true, false),
   ROT_90_REF_Y_NEG("rot_90_ref_y_neg", rqf_3.P321, true, true, false),
   ROT_90_REF_Y_POS("rot_90_ref_y_pos", rqf_3.P321, false, true, true),
   ROT_90_REF_Z_NEG("rot_90_ref_z_neg", rqf_3.P213, false, true, true),
   ROT_90_REF_Z_POS("rot_90_ref_z_pos", rqf_3.P213, true, false, true);

   private final rjj_3 field_235517_W_;
   private final String field_235518_X_;
   private Map<rpr_3, rpr_3> field_235519_Y_;
   private final boolean field_235520_Z_;
   private final boolean field_235521_aa_;
   private final boolean field_235522_ab_;
   private final rqf_3 field_235523_ac_;
   private static final rjg_3[][] field_235524_ad_ = rqR_2.class_(new rjg_3[values().length][values().length], var0 -> {
      Map var1 = Arrays.stream(values()).collect(Collectors.toMap(var0x -> Pair.of(var0x.field_235523_ac_, var0x.break_()), var0x -> (rjg_3)var0x));

      for (rjg_3 var5 : values()) {
         for (rjg_3 var9 : values()) {
            BooleanList var10 = var5.break_();
            BooleanList var11 = var9.break_();
            rqf_3 var12 = var9.field_235523_ac_.class_(var5.field_235523_ac_);
            BooleanArrayList var13 = new BooleanArrayList(3);

            for (int var14 = 0; var14 < 3; var14++) {
               var13.add(var10.getBoolean(var14) ^ var11.getBoolean(var5.field_235523_ac_.class_(var14)));
            }

            var0[var5.ordinal()][var9.ordinal()] = (rjg_3)var1.get(Pair.of(var12, var13));
         }
      }
   });
   private static final rjg_3[] field_235525_ae_ = Arrays.stream(values())
      .map(var0 -> Arrays.stream(values()).filter(var1 -> var0.class_(var1) == IDENTITY).findAny().get())
      .toArray(rjg_3[]::new);

   private rjg_3(String var3, rqf_3 var4, boolean var5, boolean var6, boolean var7) {
      this.field_235518_X_ = var3;
      this.field_235520_Z_ = var5;
      this.field_235521_aa_ = var6;
      this.field_235522_ab_ = var7;
      this.field_235523_ac_ = var4;
      this.field_235517_W_ = new rjj_3();
      this.field_235517_W_.class_ = var5 ? -1.0F : 1.0F;
      this.field_235517_W_.throws_ = var6 ? -1.0F : 1.0F;
      this.field_235517_W_.implements_ = var7 ? -1.0F : 1.0F;
      this.field_235517_W_.break_(var4.class_());
   }

   @Override
   public String toString() {
      return this.field_235518_X_;
   }

   public rec_3 class_(rec_3 var1) {
      return rec_3.class_(this.class_(var1.break_()), this.class_(var1.byte_()));
   }

   public rpr_3 class_(rpr_3 var1) {
      if (this.field_235519_Y_ == null) {
         this.field_235519_Y_ = Maps.newEnumMap(rpr_3.class);

         for (rpr_3 var5 : rpr_3.values()) {
            rpB_2 var6 = var5.final_();
            rpG_2 var7 = var5.throws_();
            rpB_2 var8 = rpB_2.values()[this.field_235523_ac_.class_(var6.ordinal())];
            rpG_2 var9 = this.class_(var8) ? var7.break_() : var7;
            rpr_3 var10 = rpr_3.class_(var8, var9);
            this.field_235519_Y_.put(var5, var10);
         }
      }

      return this.field_235519_Y_.get(var1);
   }

   public boolean class_(rpB_2 var1) {
      switch (var1) {
         case X:
            return this.field_235520_Z_;
         case Y:
            return this.field_235521_aa_;
         case Z:
         default:
            return this.field_235522_ab_;
      }
   }

   public rjg_3 class_(rjg_3 var1) {
      return field_235524_ad_[this.ordinal()][var1.ordinal()];
   }

   @Override
   public String class_() {
      return this.field_235518_X_;
   }

   private BooleanList break_() {
      return new BooleanArrayList(new boolean[]{this.field_235520_Z_, this.field_235521_aa_, this.field_235522_ab_});
   }
}
