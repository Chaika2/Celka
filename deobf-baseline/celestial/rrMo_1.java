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
   private static boolean id_class = false;
   private static Map<aI_2, pV_2> id_break = null;
   private static Map<ryW_2, jW_2> id_byte = null;
   private static Map<WI, In_1> id_protected = null;
   private static List<ryW_2> id_throws = new ArrayList<>();

   private static Map<aI_2, pV_2> id_byte() {
      pg_3 var0 = QY.id_instanceof().id_case();
      Map var1 = var0.id_throws();
      if (var1 == null) {
         return null;
      } else {
         if (id_break == null) {
            id_break = new HashMap<>(var1);
         }

         return var1;
      }
   }

   private static boolean id_class(rrMi_1 var0, In_1 var1, rrMU var2, rrXJ var3) {
      String var4 = var2.id_break();
      Iq_1 var5 = var0.id_class(var1, var4);
      if (var5 == null) {
         rrbb_3.id_protected("Model part not found: " + var4 + ", model: " + var1);
         return false;
      } else {
         if (!var2.id_byte()) {
            if (var5.id_extends != null) {
               var5.id_extends.clear();
            }

            if (var5.id_volatile != null) {
               var5.id_volatile.clear();
            }

            if (var5.id_native != null) {
               Iq_1[] var6 = var0.id_class(var1);
               Set var7 = Collections.newSetFromMap(new IdentityHashMap());
               var7.addAll(Arrays.asList(var6));
               ObjectList var8 = var5.id_native;
               Iterator var9 = var8.iterator();

               while (var9.hasNext()) {
                  Iq_1 var10 = (Iq_1)var9.next();
                  if (!var7.contains(var10)) {
                     var9.remove();
                  }
               }
            }
         }

         var5.id_break(var2.id_class());
         rrXx_1 var11 = var2.id_protected();
         if (var11 != null) {
            var3.id_break(var2.id_class());
            var3.id_class(var5);
            if (!var11.id_class(var3)) {
               return false;
            }

            var2.id_class().id_class(var11);
         }

         return true;
      }
   }

   private static boolean id_class(rrMi_1 var0, In_1 var1, rrMU[] var2, rrXJ var3) {
      for (int var4 = 0; var4 < var2.length; var4++) {
         rrMU var5 = var2[var4];
         if (!id_class(var0, var1, var5, var3)) {
            return false;
         }
      }

      return true;
   }

   private static void id_class(rrMi_1 var0, In_1 var1, rrMa_1 var2, rqO_2 var3) {
      if (var2 instanceof qd_3) {
         var2.id_class(var3);
      } else {
         String[] var4 = var0.id_case();

         for (int var5 = 0; var5 < var4.length; var5++) {
            String var6 = var4[var5];
            Iq_1 var7 = var0.id_class(var1, var6);
            if (var7 != null && var7.id_break() == null) {
               var7.id_class(var3);
            }
         }
      }
   }

   private static rrMa_1 id_class(rrMi_1 var0, rrMK var1) {
      rqO_2 var2 = var1.id_byte();
      rrMU[] var3 = var1.id_protected();
      float var4 = var1.id_throws();
      if (var4 < 0.0F) {
         var4 = var0.id_protected();
      }

      In_1 var5 = var0.id_throws();
      if (var5 == null) {
         return null;
      } else {
         rrXJ var6 = new rrXJ(var0, var5, var3);
         if (!id_class(var0, var5, var3, var6)) {
            return null;
         } else {
            rrMa_1 var7 = var0.id_class(var5, var4);
            if (var7 == null) {
               throw new JsonParseException("Entity renderer is null, model: " + var0.id_break() + ", adapter: " + var0.getClass().getName());
            } else {
               if (var2 != null) {
                  id_class(var0, var5, var7, var2);
               }

               return var7;
            }
         }
      }
   }

   private static void id_class(Object var0, String var1) {
      if (var0 == null) {
         throw new JsonParseException(var1);
      }
   }

   public static boolean id_class(xc_3 var0) {
      xd_3 var1 = var0.id_break();

      for (int var2 = 0; var2 < id_throws.size(); var2++) {
         ryW_2 var3 = id_throws.get(var2);
         if (var3.id_class(var1)) {
            return true;
         }
      }

      return false;
   }

   private static rrMa_1 id_class(JsonObject var0, String var1) {
      rrMK var2 = rrMY.id_class(var0, var1);
      String var3 = var2.id_class();
      rrMi_1 var4 = rrMD.id_class(var3);
      id_class(var4, "Entity not found: " + var3);
      rrWQ var5 = var4.id_class();
      id_class(var5, "Entity type not found: " + var3);
      rrMa_1 var6 = id_class(var4, var2);
      if (var6 == null) {
         return null;
      } else {
         var6.id_class(var5);
         return var6;
      }
   }

   private static void id_class(tm_3 var0) {
      tm_3 var1 = (tm_3)rrxr_3.SO.id_byte();
      if (var1 != null && var0 != null) {
         if (!rrxr_3.St.id_protected()) {
            return;
         }

         if (!rrxr_3.Sw.id_protected()) {
            return;
         }

         int var2 = rrxr_3.St.id_byte();

         for (int var3 = 0; var3 < var2; var3++) {
            Iq_1 var4 = (Iq_1)rrxr_3.St.id_class(var0, var3);
            rrxr_3.St.id_class(var1, var3, var4);
         }

         List var5 = (List)rrxr_3.Sw.id_class(var0);
         rrxr_3.Sw.id_class(var1, var5);
         var1.id_return = var0.id_return;
         var1.id_public = var0.id_public;
      }
   }

   private static rrMa_1 id_class(rqO_2 var0) {
      try {
         JsonObject var1 = rrMY.id_class(var0);
         return id_class(var1, var0.id_break());
      } catch (IOException var2) {
         rrbb_3.id_throws(var2.getClass().getName() + ": " + var2.getMessage());
         return null;
      } catch (JsonParseException var3) {
         rrbb_3.id_throws(var3.getClass().getName() + ": " + var3.getMessage());
         return null;
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static void id_class() {
      Map var0 = id_byte();
      Map var1 = id_protected();
      Map var2 = id_throws();
      if (var0 == null) {
         rrbb_3.id_protected("Entity render map not found, custom entity models are DISABLED.");
      } else if (var1 == null) {
         rrbb_3.id_protected("Tile entity render map not found, custom entity models are DISABLED.");
      } else {
         id_class = false;
         var0.clear();
         var1.clear();
         var2.clear();
         id_throws.clear();
         var0.putAll(id_break);
         var1.putAll(id_byte);
         var2.putAll(id_protected);
         jG_2.id_class.id_break = new wp_3();
         id_class(new tm_3());
         if (rrbb_3.rC()) {
            rqO_2[] var3 = id_case();

            for (int var4 = 0; var4 < var3.length; var4++) {
               rqO_2 var5 = var3[var4];
               rrbb_3.id_byte("CustomEntityModel: " + var5.id_break());
               rrMa_1 var6 = id_class(var5);
               if (var6 != null) {
                  rrWQ var7 = var6.id_byte();
                  if (var6 instanceof pV_2) {
                     var0.put((aI_2)var7.id_class().get(), (pV_2)var6);
                     if (var6 instanceof Tr_1) {
                        Tr_1 var8 = (Tr_1)var6;
                        wp_3 var9 = (wp_3)rrxr_3.id_class(var8, rrxr_3.Gs);
                        if (var9 != null) {
                           jG_2.id_class.id_break = var9;
                        }
                     }
                  } else if (var6 instanceof jW_2) {
                     var1.put((ryW_2)var7.id_break().get(), (jW_2)var6);
                     if (var6 instanceof jS_2 var10) {
                        tm_3 var11 = (tm_3)rrxr_3.id_class(var10, rrxr_3.GF);
                        id_class(var11);
                     }

                     id_throws.add((ryW_2)var7.id_break().get());
                  } else {
                     rrbb_3.id_protected("Unknown renderer type: " + var6.getClass().getName());
                  }

                  id_class = true;
               }
            }
         }
      }
   }

   public static boolean id_break() {
      return id_class;
   }

   private static Map<WI, In_1> id_throws() {
      Object var0 = (Map)rrxr_3.Gp.id_byte();
      if (var0 == null) {
         rrbb_3.id_protected("Field not found: TileEntitySkullRenderer.MODELS");
         var0 = new HashMap();
      }

      if (id_protected == null) {
         id_protected = new HashMap<>((Map<? extends WI, ? extends In_1>)var0);
      }

      return (Map<WI, In_1>)var0;
   }

   private static rqO_2[] id_case() {
      String var0 = "optifine/cem/";
      String var1 = ".jem";
      ArrayList var2 = new ArrayList();
      String[] var3 = rrMD.id_class();

      for (int var4 = 0; var4 < var3.length; var4++) {
         String var5 = var3[var4];
         String var6 = var0 + var5 + var1;
         rqO_2 var7 = new rqO_2(var6);
         if (rrbb_3.id_byte(var7)) {
            var2.add(var7);
         }
      }

      return var2.toArray(new rqO_2[var2.size()]);
   }

   private static Map<ryW_2, jW_2> id_protected() {
      Map var0 = jz_3.id_break.id_class;
      if (id_byte == null) {
         id_byte = new HashMap<>(var0);
      }

      return var0;
   }
}
