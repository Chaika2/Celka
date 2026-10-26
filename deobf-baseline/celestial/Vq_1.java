package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.IOUtils;

public class Vq_1 implements AutoCloseable {
   private final VC id_class;
   private final rAL id_break;
   private final String id_byte;
   private final List<Vy_1> id_protected = Lists.newArrayList();
   private final Map<String, VC> id_throws = Maps.newHashMap();
   private final List<VC> id_case = Lists.newArrayList();
   private rjV_2 id_catch;
   private int id_private;
   private int id_implements;
   private float id_finally;
   private float id_extends;

   public Vq_1(fY_2 var1, rAL var2, VC var3, rqO_2 var4) throws IOException, JsonSyntaxException {
      this.id_break = var2;
      this.id_class = var3;
      this.id_finally = 0.0F;
      this.id_extends = 0.0F;
      this.id_private = var3.id_byte;
      this.id_implements = var3.id_protected;
      this.id_byte = var4.toString();
      this.id_break();
      this.id_class(var1, var4);
   }

   public void id_class(float var1) {
      if (var1 < this.id_extends) {
         this.id_finally = this.id_finally + (1.0F - this.id_extends);
         this.id_finally += var1;
      } else {
         this.id_finally = this.id_finally + (var1 - this.id_extends);
      }

      this.id_extends = var1;

      while (this.id_finally > 20.0F) {
         this.id_finally -= 20.0F;
      }

      for (Vy_1 var3 : this.id_protected) {
         var3.id_class(this.id_finally / 20.0F);
      }
   }

   public void id_class(String var1, int var2, int var3) {
      VC var4 = new VC(var2, var3, true, (Boolean)QY.id_break[2]);
      var4.id_class(0.0F, 0.0F, 0.0F, 0.0F);
      this.id_throws.put(var1, var4);
      if (var2 == this.id_private && var3 == this.id_implements) {
         this.id_case.add(var4);
      }
   }

   public VC id_class(String var1) {
      return this.id_throws.get(var1);
   }

   public Vy_1 id_class(String var1, VC var2, VC var3) throws IOException {
      Vy_1 var4 = new Vy_1(this.id_break, var1, var2, var3);
      this.id_protected.add(this.id_protected.size(), var4);
      return var4;
   }

   public void id_class(int var1, int var2) {
      this.id_private = this.id_class.id_class;
      this.id_implements = this.id_class.id_break;
      this.id_break();

      for (Vy_1 var4 : this.id_protected) {
         var4.id_class(this.id_catch);
      }

      for (VC var6 : this.id_case) {
         var6.id_class(var1, var2, (Boolean)QY.id_break[2]);
      }
   }

   private void id_class(fY_2 var1, rqO_2 var2) throws IOException, JsonSyntaxException {
      rAF var3 = null;

      try {
         var3 = this.id_break.id_class(var2);
         JsonObject var4 = rpY_2.id_class(new InputStreamReader(var3.id_break(), StandardCharsets.UTF_8));
         if (rpY_2.id_byte(var4, "targets")) {
            JsonArray var20 = var4.getAsJsonArray("targets");
            int var22 = 0;

            for (JsonElement var8 : var20) {
               try {
                  this.id_class(var8);
               } catch (Exception var17) {
                  gP_2 var10 = gP_2.id_class(var17);
                  var10.id_class("targets[" + var22 + "]");
                  throw var10;
               }

               var22++;
            }
         }

         if (rpY_2.id_byte(var4, "passes")) {
            JsonArray var21 = var4.getAsJsonArray("passes");
            int var23 = 0;

            for (JsonElement var25 : var21) {
               try {
                  this.id_class(var1, var25);
               } catch (Exception var16) {
                  gP_2 var26 = gP_2.id_class(var16);
                  var26.id_class("passes[" + var23 + "]");
                  throw var26;
               }

               var23++;
            }
         }
      } catch (Exception var18) {
         String var5;
         if (var3 != null) {
            var5 = " (" + var3.id_byte() + ")";
         } else {
            var5 = "";
         }

         gP_2 var6 = gP_2.id_class(var18);
         var6.id_break(var2.id_break() + var5);
         throw var6;
      } finally {
         IOUtils.closeQuietly(var3);
      }
   }

   private void id_class(JsonElement var1) throws gP_2 {
      if (rpY_2.id_class(var1)) {
         this.id_class(var1.getAsString(), this.id_private, this.id_implements);
      } else {
         JsonObject var2 = rpY_2.id_private(var1, "target");
         String var3 = rpY_2.id_case(var2, "name");
         int var4 = rpY_2.id_class(var2, "width", this.id_private);
         int var5 = rpY_2.id_class(var2, "height", this.id_implements);
         if (this.id_throws.containsKey(var3)) {
            throw new gP_2(var3 + " is already defined");
         }

         this.id_class(var3, var4, var5);
      }
   }

   private void id_class(fY_2 var1, JsonElement var2) throws IOException {
      JsonObject var3 = rpY_2.id_private(var2, "pass");
      String var4 = rpY_2.id_case(var3, "name");
      String var5 = rpY_2.id_case(var3, "intarget");
      String var6 = rpY_2.id_case(var3, "outtarget");
      VC var7 = this.id_break(var5);
      VC var8 = this.id_break(var6);
      if (var7 == null) {
         throw new gP_2("Input target '" + var5 + "' does not exist");
      } else if (var8 == null) {
         throw new gP_2("Output target '" + var6 + "' does not exist");
      } else {
         Vy_1 var9 = this.id_class(var4, var7, var8);
         JsonArray var10 = rpY_2.id_class(var3, "auxtargets", (JsonArray)null);
         if (var10 != null) {
            int var11 = 0;

            for (JsonElement var13 : var10) {
               try {
                  JsonObject var14 = rpY_2.id_private(var13, "auxtarget");
                  String var38 = rpY_2.id_case(var14, "name");
                  String var16 = rpY_2.id_case(var14, "id");
                  boolean var17;
                  String var18;
                  if (var16.endsWith(":depth")) {
                     var17 = true;
                     var18 = var16.substring(0, var16.lastIndexOf(58));
                  } else {
                     var17 = false;
                     var18 = var16;
                  }

                  VC var19 = this.id_break(var18);
                  if (var19 == null) {
                     if (var17) {
                        throw new gP_2("Render target '" + var18 + "' can't be used as depth buffer");
                     }

                     rqO_2 var20 = new rqO_2("textures/effect/" + var18 + ".png");
                     rAF var21 = null;

                     try {
                        var21 = this.id_break.id_class(var20);
                     } catch (FileNotFoundException var31) {
                        throw new gP_2("Render target or texture '" + var18 + "' does not exist");
                     } finally {
                        IOUtils.closeQuietly(var21);
                     }

                     var1.id_class(var20);
                     ff_3 var22 = var1.id_break(var20);
                     int var23 = rpY_2.id_extends(var14, "width");
                     int var24 = rpY_2.id_extends(var14, "height");
                     boolean var25 = rpY_2.id_private(var14, "bilinear");
                     if (var25) {
                        RenderSystem.texParameter(3553, 10241, 9729);
                        RenderSystem.texParameter(3553, 10240, 9729);
                     } else {
                        RenderSystem.texParameter(3553, 10241, 9728);
                        RenderSystem.texParameter(3553, 10240, 9728);
                     }

                     var9.id_class(var38, var22::id_new, var23, var24);
                  } else if (var17) {
                     var9.id_class(var38, var19::id_catch, var19.id_class, var19.id_break);
                  } else {
                     var9.id_class(var38, var19::id_case, var19.id_class, var19.id_break);
                  }
               } catch (Exception var33) {
                  gP_2 var15 = gP_2.id_class(var33);
                  var15.id_class("auxtargets[" + var11 + "]");
                  throw var15;
               }

               var11++;
            }
         }

         JsonArray var34 = rpY_2.id_class(var3, "uniforms", (JsonArray)null);
         if (var34 != null) {
            int var35 = 0;

            for (JsonElement var37 : var34) {
               try {
                  this.id_break(var37);
               } catch (Exception var30) {
                  gP_2 var39 = gP_2.id_class(var30);
                  var39.id_class("uniforms[" + var35 + "]");
                  throw var39;
               }

               var35++;
            }
         }
      }
   }

   public final String id_class() {
      return this.id_byte;
   }

   @Override
   public void close() {
      for (VC var2 : this.id_throws.values()) {
         var2.id_class();
      }

      for (Vy_1 var4 : this.id_protected) {
         var4.close();
      }

      this.id_protected.clear();
   }

   private VC id_break(String var1) {
      if (var1 == null) {
         return null;
      } else {
         return var1.equals("minecraft:main") ? this.id_class : this.id_throws.get(var1);
      }
   }

   private void id_break(JsonElement var1) throws gP_2 {
      JsonObject var2 = rpY_2.id_private(var1, "uniform");
      String var3 = rpY_2.id_case(var2, "name");
      Vf_1 var4 = this.id_protected.get(this.id_protected.size() - 1).id_class().id_class(var3);
      if (var4 == null) {
         throw new gP_2("Uniform '" + var3 + "' does not exist");
      } else {
         float[] var5 = new float[4];
         int var6 = 0;

         for (JsonElement var8 : rpY_2.id_volatile(var2, "values")) {
            try {
               var5[var6] = rpY_2.id_protected(var8, "value");
            } catch (Exception var11) {
               gP_2 var10 = gP_2.id_class(var11);
               var10.id_class("values[" + var6 + "]");
               throw var10;
            }

            var6++;
         }

         switch (var6) {
            case 0:
            default:
               break;
            case 1:
               var4.id_class(var5[0]);
               break;
            case 2:
               var4.id_class(var5[0], var5[1]);
               break;
            case 3:
               var4.id_class(var5[0], var5[1], var5[2]);
               break;
            case 4:
               var4.id_class(var5[0], var5[1], var5[2], var5[3]);
         }
      }
   }

   private void id_break() {
      this.id_catch = rjV_2.id_class((float)this.id_class.id_class, (float)this.id_class.id_break, 0.1F, 1000.0F);
   }
}
