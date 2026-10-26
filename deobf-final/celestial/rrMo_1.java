package celestial;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import it.unimi.dsi.fastutil.objects.ObjectList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class rrMo_1 {
   private static boolean class_ = false;
   private static Map<aI_2, pV_2> break_ = null;
   private static Map<ryW_2, jW_2> byte_ = null;
   private static Map<WI, In_1> protected_ = null;
   private static List<ryW_2> throws_ = new ArrayList<>();

   private static Map<aI_2, pV_2> byte_() {
      pg_3 var0 = QY.instanceof_().case_();
      Map var1 = var0.throws_();
      if (var1 == null) {
         return null;
      } else {
         if (break_ == null) {
            break_ = new HashMap<>(var1);
         }

         return var1;
      }
   }

   private static boolean class_(rrMi_1 var0, In_1 var1, rrMU var2, rrXJ var3) {
      String var4 = var2.break_();
      Iq_1 var5 = var0.class_(var1, var4);
      if (var5 == null) {
         rrbb_3.protected_("Model part not found: " + var4 + ", model: " + var1);
         return false;
      } else {
         if (!var2.byte_()) {
            if (var5.extends_ != null) {
               var5.extends_.clear();
            }

            if (var5.volatile_ != null) {
               var5.volatile_.clear();
            }

            if (var5.native_ != null) {
               Iq_1[] var6 = var0.class_(var1);
               Set var7 = Collections.newSetFromMap(new IdentityHashMap());
               var7.addAll(Arrays.asList(var6));
               ObjectList var8 = var5.native_;
               Iterator var9 = var8.iterator();

               while (var9.hasNext()) {
                  Iq_1 var10 = (Iq_1)var9.next();
                  if (!var7.contains(var10)) {
                     var9.remove();
                  }
               }
            }
         }

         var5.break_(var2.class_());
         rrXx_1 var11 = var2.protected_();
         if (var11 != null) {
            var3.break_(var2.class_());
            var3.class_(var5);
            if (!var11.class_(var3)) {
               return false;
            }

            var2.class_().class_(var11);
         }

         return true;
      }
   }

   private static boolean class_(rrMi_1 var0, In_1 var1, rrMU[] var2, rrXJ var3) {
      for (int var4 = 0; var4 < var2.length; var4++) {
         rrMU var5 = var2[var4];
         if (!class_(var0, var1, var5, var3)) {
            return false;
         }
      }

      return true;
   }

   private static void class_(rrMi_1 var0, In_1 var1, rrMa_1 var2, rqO_2 var3) {
      if (var2 instanceof qd_3) {
         var2.class_(var3);
      } else {
         String[] var4 = var0.case_();

         for (int var5 = 0; var5 < var4.length; var5++) {
            String var6 = var4[var5];
            Iq_1 var7 = var0.class_(var1, var6);
            if (var7 != null && var7.break_() == null) {
               var7.class_(var3);
            }
         }
      }
   }

   private static rrMa_1 class_(rrMi_1 var0, rrMK var1) {
      rqO_2 var2 = var1.byte_();
      rrMU[] var3 = var1.protected_();
      float var4 = var1.throws_();
      if (var4 < 0.0F) {
         var4 = var0.protected_();
      }

      In_1 var5 = var0.throws_();
      if (var5 == null) {
         return null;
      } else {
         rrXJ var6 = new rrXJ(var0, var5, var3);
         if (!class_(var0, var5, var3, var6)) {
            return null;
         } else {
            rrMa_1 var7 = var0.class_(var5, var4);
            if (var7 == null) {
               throw new JsonParseException("Entity renderer is null, model: " + var0.break_() + ", adapter: " + var0.getClass().getName());
            } else {
               if (var2 != null) {
                  class_(var0, var5, var7, var2);
               }

               return var7;
            }
         }
      }
   }

   private static void class_(Object var0, String var1) {
      if (var0 == null) {
         throw new JsonParseException(var1);
      }
   }

   public static boolean class_(xc_3 var0) {
      xd_3 var1 = var0.break_();

      for (int var2 = 0; var2 < throws_.size(); var2++) {
         ryW_2 var3 = throws_.get(var2);
         if (var3.class_(var1)) {
            return true;
         }
      }

      return false;
   }

   private static rrMa_1 class_(JsonObject var0, String var1) {
      rrMK var2 = rrMY.class_(var0, var1);
      String var3 = var2.class_();
      rrMi_1 var4 = rrMD.class_(var3);
      class_(var4, "Entity not found: " + var3);
      rrWQ var5 = var4.class_();
      class_(var5, "Entity type not found: " + var3);
      rrMa_1 var6 = class_(var4, var2);
      if (var6 == null) {
         return null;
      } else {
         var6.class_(var5);
         return var6;
      }
   }

   private static void class_(tm_3 var0) {
      tm_3 var1 = (tm_3)rrxr_3.SO.byte_();
      if (var1 != null && var0 != null) {
         if (!rrxr_3.St.protected_()) {
            return;
         }

         if (!rrxr_3.Sw.protected_()) {
            return;
         }

         int var2 = rrxr_3.St.byte_();

         for (int var3 = 0; var3 < var2; var3++) {
            Iq_1 var4 = (Iq_1)rrxr_3.St.class_(var0, var3);
            rrxr_3.St.class_(var1, var3, var4);
         }

         List var5 = (List)rrxr_3.Sw.class_(var0);
         rrxr_3.Sw.class_(var1, var5);
         var1.return_ = var0.return_;
         var1.public_ = var0.public_;
      }
   }

   private static rrMa_1 class_(rqO_2 var0) {
      try {
         JsonObject var1 = rrMY.class_(var0);
         return class_(var1, var0.break_());
      } catch (IOException var2) {
         rrbb_3.throws_(var2.getClass().getName() + ": " + var2.getMessage());
         return null;
      } catch (JsonParseException var3) {
         rrbb_3.throws_(var3.getClass().getName() + ": " + var3.getMessage());
         return null;
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static void class_() {
      Map var0 = byte_();
      Map var1 = protected_();
      Map var2 = throws_();
      if (var0 == null) {
         rrbb_3.protected_("Entity render map not found, custom entity models are DISABLED.");
      } else if (var1 == null) {
         rrbb_3.protected_("Tile entity render map not found, custom entity models are DISABLED.");
      } else {
         class_ = false;
         var0.clear();
         var1.clear();
         var2.clear();
         throws_.clear();
         var0.putAll(break_);
         var1.putAll(byte_);
         var2.putAll(protected_);
         jG_2.class_.break_ = new wp_3();
         class_(new tm_3());
         if (rrbb_3.rC()) {
            rqO_2[] var3 = case_();

            for (int var4 = 0; var4 < var3.length; var4++) {
               rqO_2 var5 = var3[var4];
               rrbb_3.byte_("CustomEntityModel: " + var5.break_());
               rrMa_1 var6 = class_(var5);
               if (var6 != null) {
                  rrWQ var7 = var6.byte_();
                  if (var6 instanceof pV_2) {
                     var0.put((aI_2)var7.class_().get(), (pV_2)var6);
                     if (var6 instanceof Tr_1) {
                        Tr_1 var8 = (Tr_1)var6;
                        wp_3 var9 = (wp_3)rrxr_3.class_(var8, rrxr_3.Gs);
                        if (var9 != null) {
                           jG_2.class_.break_ = var9;
                        }
                     }
                  } else if (var6 instanceof jW_2) {
                     var1.put((ryW_2)var7.break_().get(), (jW_2)var6);
                     if (var6 instanceof jS_2 var10) {
                        tm_3 var11 = (tm_3)rrxr_3.class_(var10, rrxr_3.GF);
                        class_(var11);
                     }

                     throws_.add((ryW_2)var7.break_().get());
                  } else {
                     rrbb_3.protected_("Unknown renderer type: " + var6.getClass().getName());
                  }

                  class_ = true;
               }
            }
         }
      }
   }

   public static boolean break_() {
      return class_;
   }

   private static Map<WI, In_1> throws_() {
      Object var0 = (Map)rrxr_3.Gp.byte_();
      if (var0 == null) {
         rrbb_3.protected_("Field not found: TileEntitySkullRenderer.MODELS");
         var0 = new HashMap();
      }

      if (protected_ == null) {
         protected_ = new HashMap<>((Map<? extends WI, ? extends In_1>)var0);
      }

      return (Map<WI, In_1>)var0;
   }

   private static rqO_2[] case_() {
      String var0 = "optifine/cem/";
      String var1 = ".jem";
      ArrayList var2 = new ArrayList();
      String[] var3 = rrMD.class_();

      for (int var4 = 0; var4 < var3.length; var4++) {
         String var5 = var3[var4];
         String var6 = var0 + var5 + var1;
         rqO_2 var7 = new rqO_2(var6);
         if (rrbb_3.byte_(var7)) {
            var2.add(var7);
         }
      }

      return var2.toArray(new rqO_2[var2.size()]);
   }

   private static Map<ryW_2, jW_2> protected_() {
      Map var0 = jz_3.break_.class_;
      if (byte_ == null) {
         byte_ = new HashMap<>(var0);
      }

      return var0;
   }
}
