package celestial;

public enum rrkm_1 {
   BIOME("biome"),
   BIOME_CATEGORY("biome_category"),
   BIOME_PRECIPITATION("biome_precipitation"),
   TEMPERATURE("temperature"),
   RAINFALL("rainfall"),
   HELD_ITEM_ID(rrdZ.rg),
   HELD_BLOCK_LIGHT_VALUE(rrdZ.rR),
   HELD_ITEM_ID2(rrdZ.rY),
   HELD_BLOCK_LIGHT_VALUE2(rrdZ.ro),
   WORLD_TIME(rrdZ.ra),
   WORLD_DAY(rrdZ.ri),
   MOON_PHASE(rrdZ.Pr),
   FRAME_COUNTER(rrdZ.PP),
   FRAME_TIME(rrdZ.PB),
   FRAME_TIME_COUNTER(rrdZ.PS),
   SUN_ANGLE(rrdZ.Ps),
   SHADOW_ANGLE(rrdZ.PE),
   RAIN_STRENGTH(rrdZ.PG),
   ASPECT_RATIO(rrdZ.Pb),
   VIEW_WIDTH(rrdZ.PM),
   VIEW_HEIGHT(rrdZ.PO),
   NEAR(rrdZ.Ph),
   FAR(rrdZ.PX),
   WETNESS(rrdZ.Pn),
   EYE_ALTITUDE(rrdZ.PC),
   EYE_BRIGHTNESS(rrdZ.Pl, new String[]{"x", "y"}),
   TERRAIN_TEXTURE_SIZE(rrdZ.Py, new String[]{"x", "y"}),
   TERRRAIN_ICON_SIZE(rrdZ.Pp),
   IS_EYE_IN_WATER(rrdZ.Pq),
   NIGHT_VISION(rrdZ.PT),
   BLINDNESS(rrdZ.Pt),
   SCREEN_BRIGHTNESS(rrdZ.Pw),
   HIDE_GUI(rrdZ.PI),
   CENTER_DEPT_SMOOTH(rrdZ.Pf),
   ATLAS_SIZE(rrdZ.Pj, new String[]{"x", "y"}),
   PLAYER_MOOD(rrdZ.PY),
   CAMERA_POSITION(rrdZ.Pz, new String[]{"x", "y", "z"}),
   PREVIOUS_CAMERA_POSITION(rrdZ.PW, new String[]{"x", "y", "z"}),
   SUN_POSITION(rrdZ.PJ, new String[]{"x", "y", "z"}),
   MOON_POSITION(rrdZ.Px, new String[]{"x", "y", "z"}),
   SHADOW_LIGHT_POSITION(rrdZ.Pd, new String[]{"x", "y", "z"}),
   UP_POSITION(rrdZ.Pk, new String[]{"x", "y", "z"}),
   SKY_COLOR(rrdZ.re, new String[]{"r", "g", "b"}),
   GBUFFER_PROJECTION(rrdZ.Pu, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"}),
   GBUFFER_PROJECTION_INVERSE(rrdZ.Pm, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"}),
   GBUFFER_PREVIOUS_PROJECTION(rrdZ.Pc, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"}),
   GBUFFER_MODEL_VIEW(rrdZ.PQ, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"}),
   GBUFFER_MODEL_VIEW_INVERSE(rrdZ.PN, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"}),
   GBUFFER_PREVIOUS_MODEL_VIEW(rrdZ.PZ, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"}),
   SHADOW_PROJECTION(rrdZ.Pv, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"}),
   SHADOW_PROJECTION_INVERSE(rrdZ.PF, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"}),
   SHADOW_MODEL_VIEW(rrdZ.PL, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"}),
   SHADOW_MODEL_VIEW_INVERSE(rrdZ.PA, new String[]{"0", "1", "2", "3"}, new String[]{"0", "1", "2", "3"});

   private String name;
   private rrky_1 uniform;
   private String[] indexNames1;
   private String[] indexNames2;

   public String[] byte_() {
      return this.indexNames1;
   }

   private rrkm_1(rrky_1 var3, String[] var4) {
      this.name = var3.byte_();
      this.uniform = var3;
      this.indexNames1 = var4;
      if (!class_(var3, rrkn_1.class, rrkA.class, rrkC.class, rrkl_1.class)) {
         throw new IllegalArgumentException("Invalid uniform type for enum: " + this + ", uniform: " + var3.getClass().getName());
      }
   }

   private rrkm_1(rrky_1 var3, String[] var4, String[] var5) {
      this.name = var3.byte_();
      this.uniform = var3;
      this.indexNames1 = var4;
      this.indexNames2 = var5;
      if (!class_(var3, rrkp_1.class)) {
         throw new IllegalArgumentException("Invalid uniform type for enum: " + this + ", uniform: " + var3.getClass().getName());
      }
   }

   private rrkm_1(String var3) {
      this.name = var3;
   }

   private rrkm_1(rrky_1 var3) {
      this.name = var3.byte_();
      this.uniform = var3;
      if (!class_(var3, rrkF.class, rrkL.class)) {
         throw new IllegalArgumentException("Invalid uniform type for enum: " + this + ", uniform: " + var3.getClass().getName());
      }
   }

   private static boolean class_(Object var0, Class... var1) {
      if (var0 == null) {
         return false;
      } else {
         Class var2 = var0.getClass();

         for (int var3 = 0; var3 < var1.length; var3++) {
            Class var4 = var1[var3];
            if (var4.isAssignableFrom(var2)) {
               return true;
            }
         }

         return false;
      }
   }

   public float class_(int var1, int var2) {
      if (this.indexNames1 == null || var1 >= 0 && var1 <= this.indexNames1.length) {
         if (this.indexNames2 == null || var2 >= 0 && var2 <= this.indexNames2.length) {
            switch (this) {
               case BIOME:
                  rfH_2 var3 = rrdZ.D();
                  rYG var4 = rrdZ.K().implements_(var3);
                  return (float)rrWr_1.break_(var4);
               case BIOME_CATEGORY:
                  rfH_2 var5 = rrdZ.D();
                  rYG var6 = rrdZ.K().implements_(var5);
                  return var6 != null ? (float)var6.this_().ordinal() : 0.0F;
               case BIOME_PRECIPITATION:
                  rfH_2 var7 = rrdZ.D();
                  rYG var8 = rrdZ.K().implements_(var7);
                  return var8 != null ? (float)var8.byte_().ordinal() : 0.0F;
               case TEMPERATURE:
                  rfH_2 var9 = rrdZ.D();
                  rYG var10 = rrdZ.K().implements_(var9);
                  return var10 != null ? var10.class_(var9) : 0.0F;
               case RAINFALL:
                  rfH_2 var11 = rrdZ.D();
                  rYG var12 = rrdZ.K().implements_(var11);
                  return var12 != null ? var12.implements_() : 0.0F;
               default:
                  if (this.uniform instanceof rrkF) {
                     return ((rrkF)this.uniform).class_();
                  } else if (this.uniform instanceof rrkL) {
                     return (float)((rrkL)this.uniform).class_();
                  } else if (this.uniform instanceof rrkn_1) {
                     return (float)((rrkn_1)this.uniform).class_()[var1];
                  } else if (this.uniform instanceof rrkA) {
                     return ((rrkA)this.uniform).class_()[var1];
                  } else if (this.uniform instanceof rrkC) {
                     return ((rrkC)this.uniform).class_()[var1];
                  } else if (this.uniform instanceof rrkl_1) {
                     return ((rrkl_1)this.uniform).class_()[var1];
                  } else if (this.uniform instanceof rrkp_1) {
                     return ((rrkp_1)this.uniform).class_(var1, var2);
                  } else {
                     throw new IllegalArgumentException("Unknown uniform type: " + this);
                  }
            }
         } else {
            rrbb_3.protected_("Invalid index2, parameter: " + this + ", index: " + var2);
            return 0.0F;
         }
      } else {
         rrbb_3.protected_("Invalid index1, parameter: " + this + ", index: " + var1);
         return 0.0F;
      }
   }

   public String class_() {
      return this.name;
   }

   public rrky_1 break_() {
      return this.uniform;
   }

   public String[] protected_() {
      return this.indexNames2;
   }
}
