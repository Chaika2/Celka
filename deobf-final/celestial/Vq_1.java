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
   private final VC class_;
   private final rAL break_;
   private final String byte_;
   private final List<Vy_1> protected_ = Lists.newArrayList();
   private final Map<String, VC> throws_ = Maps.newHashMap();
   private final List<VC> case_ = Lists.newArrayList();
   private rjV_2 catch_;
   private int private_;
   private int implements_;
   private float finally_;
   private float extends_;

   public Vq_1(fY_2 var1, rAL var2, VC var3, rqO_2 var4) throws IOException, JsonSyntaxException {
      this.break_ = var2;
      this.class_ = var3;
      this.finally_ = 0.0F;
      this.extends_ = 0.0F;
      this.private_ = var3.byte_;
      this.implements_ = var3.protected_;
      this.byte_ = var4.toString();
      this.break_();
      this.class_(var1, var4);
   }

   public void class_(float var1) {
      if (var1 < this.extends_) {
         this.finally_ = this.finally_ + (1.0F - this.extends_);
         this.finally_ += var1;
      } else {
         this.finally_ = this.finally_ + (var1 - this.extends_);
      }

      this.extends_ = var1;

      while (this.finally_ > 20.0F) {
         this.finally_ -= 20.0F;
      }

      for (Vy_1 var3 : this.protected_) {
         var3.class_(this.finally_ / 20.0F);
      }
   }

   public void class_(String var1, int var2, int var3) {
      VC var4 = new VC(var2, var3, true, (Boolean)QY.break_[2]);
      var4.class_(0.0F, 0.0F, 0.0F, 0.0F);
      this.throws_.put(var1, var4);
      if (var2 == this.private_ && var3 == this.implements_) {
         this.case_.add(var4);
      }
   }

   public VC class_(String var1) {
      return this.throws_.get(var1);
   }

   public Vy_1 class_(String var1, VC var2, VC var3) throws IOException {
      Vy_1 var4 = new Vy_1(this.break_, var1, var2, var3);
      this.protected_.add(this.protected_.size(), var4);
      return var4;
   }

   public void class_(int var1, int var2) {
      this.private_ = this.class_.class_;
      this.implements_ = this.class_.break_;
      this.break_();

      for (Vy_1 var4 : this.protected_) {
         var4.class_(this.catch_);
      }

      for (VC var6 : this.case_) {
         var6.class_(var1, var2, (Boolean)QY.break_[2]);
      }
   }

   private void class_(fY_2 var1, rqO_2 var2) throws IOException, JsonSyntaxException {
      rAF var3 = null;

      try {
         var3 = this.break_.class_(var2);
         JsonObject var4 = rpY_2.class_(new InputStreamReader(var3.break_(), StandardCharsets.UTF_8));
         if (rpY_2.byte_(var4, "targets")) {
            JsonArray var20 = var4.getAsJsonArray("targets");
            int var22 = 0;

            for (JsonElement var8 : var20) {
               try {
                  this.class_(var8);
               } catch (Exception var17) {
                  gP_2 var10 = gP_2.class_(var17);
                  var10.class_("targets[" + var22 + "]");
                  throw var10;
               }

               var22++;
            }
         }

         if (rpY_2.byte_(var4, "passes")) {
            JsonArray var21 = var4.getAsJsonArray("passes");
            int var23 = 0;

            for (JsonElement var25 : var21) {
               try {
                  this.class_(var1, var25);
               } catch (Exception var16) {
                  gP_2 var26 = gP_2.class_(var16);
                  var26.class_("passes[" + var23 + "]");
                  throw var26;
               }

               var23++;
            }
         }
      } catch (Exception var18) {
         String var5;
         if (var3 != null) {
            var5 = " (" + var3.byte_() + ")";
         } else {
            var5 = "";
         }

         gP_2 var6 = gP_2.class_(var18);
         var6.break_(var2.break_() + var5);
         throw var6;
      } finally {
         IOUtils.closeQuietly(var3);
      }
   }

   private void class_(JsonElement var1) throws gP_2 {
      if (rpY_2.class_(var1)) {
         this.class_(var1.getAsString(), this.private_, this.implements_);
      } else {
         JsonObject var2 = rpY_2.private_(var1, "target");
         String var3 = rpY_2.case_(var2, "name");
         int var4 = rpY_2.class_(var2, "width", this.private_);
         int var5 = rpY_2.class_(var2, "height", this.implements_);
         if (this.throws_.containsKey(var3)) {
            throw new gP_2(var3 + " is already defined");
         }

         this.class_(var3, var4, var5);
      }
   }

   private void class_(fY_2 var1, JsonElement var2) throws IOException {
      JsonObject var3 = rpY_2.private_(var2, "pass");
      String var4 = rpY_2.case_(var3, "name");
      String var5 = rpY_2.case_(var3, "intarget");
      String var6 = rpY_2.case_(var3, "outtarget");
      VC var7 = this.break_(var5);
      VC var8 = this.break_(var6);
      if (var7 == null) {
         throw new gP_2("Input target '" + var5 + "' does not exist");
      } else if (var8 == null) {
         throw new gP_2("Output target '" + var6 + "' does not exist");
      } else {
         Vy_1 var9 = this.class_(var4, var7, var8);
         JsonArray var10 = rpY_2.class_(var3, "auxtargets", (JsonArray)null);
         if (var10 != null) {
            int var11 = 0;

            for (JsonElement var13 : var10) {
               try {
                  JsonObject var14 = rpY_2.private_(var13, "auxtarget");
                  String var38 = rpY_2.case_(var14, "name");
                  String var16 = rpY_2.case_(var14, "id");
                  boolean var17;
                  String var18;
                  if (var16.endsWith(":depth")) {
                     var17 = true;
                     var18 = var16.substring(0, var16.lastIndexOf(58));
                  } else {
                     var17 = false;
                     var18 = var16;
                  }

                  VC var19 = this.break_(var18);
                  if (var19 == null) {
                     if (var17) {
                        throw new gP_2("Render target '" + var18 + "' can't be used as depth buffer");
                     }

                     rqO_2 var20 = new rqO_2("textures/effect/" + var18 + ".png");
                     rAF var21 = null;

                     try {
                        var21 = this.break_.class_(var20);
                     } catch (FileNotFoundException var31) {
                        throw new gP_2("Render target or texture '" + var18 + "' does not exist");
                     } finally {
                        IOUtils.closeQuietly(var21);
                     }

                     var1.class_(var20);
                     ff_3 var22 = var1.break_(var20);
                     int var23 = rpY_2.extends_(var14, "width");
                     int var24 = rpY_2.extends_(var14, "height");
                     boolean var25 = rpY_2.private_(var14, "bilinear");
                     if (var25) {
                        RenderSystem.texParameter(3553, 10241, 9729);
                        RenderSystem.texParameter(3553, 10240, 9729);
                     } else {
                        RenderSystem.texParameter(3553, 10241, 9728);
                        RenderSystem.texParameter(3553, 10240, 9728);
                     }

                     var9.class_(var38, var22::new_, var23, var24);
                  } else if (var17) {
                     var9.class_(var38, var19::catch_, var19.class_, var19.break_);
                  } else {
                     var9.class_(var38, var19::case_, var19.class_, var19.break_);
                  }
               } catch (Exception var33) {
                  gP_2 var15 = gP_2.class_(var33);
                  var15.class_("auxtargets[" + var11 + "]");
                  throw var15;
               }

               var11++;
            }
         }

         JsonArray var34 = rpY_2.class_(var3, "uniforms", (JsonArray)null);
         if (var34 != null) {
            int var35 = 0;

            for (JsonElement var37 : var34) {
               try {
                  this.break_(var37);
               } catch (Exception var30) {
                  gP_2 var39 = gP_2.class_(var30);
                  var39.class_("uniforms[" + var35 + "]");
                  throw var39;
               }

               var35++;
            }
         }
      }
   }

   public final String class_() {
      return this.byte_;
   }

   @Override
   public void close() {
      for (VC var2 : this.throws_.values()) {
         var2.class_();
      }

      for (Vy_1 var4 : this.protected_) {
         var4.close();
      }

      this.protected_.clear();
   }

   private VC break_(String var1) {
      if (var1 == null) {
         return null;
      } else {
         return var1.equals("minecraft:main") ? this.class_ : this.throws_.get(var1);
      }
   }

   private void break_(JsonElement var1) throws gP_2 {
      JsonObject var2 = rpY_2.private_(var1, "uniform");
      String var3 = rpY_2.case_(var2, "name");
      Vf_1 var4 = this.protected_.get(this.protected_.size() - 1).class_().class_(var3);
      if (var4 == null) {
         throw new gP_2("Uniform '" + var3 + "' does not exist");
      } else {
         float[] var5 = new float[4];
         int var6 = 0;

         for (JsonElement var8 : rpY_2.volatile_(var2, "values")) {
            try {
               var5[var6] = rpY_2.protected_(var8, "value");
            } catch (Exception var11) {
               gP_2 var10 = gP_2.class_(var11);
               var10.class_("values[" + var6 + "]");
               throw var10;
            }

            var6++;
         }

         switch (var6) {
            case 0:
            default:
               break;
            case 1:
               var4.class_(var5[0]);
               break;
            case 2:
               var4.class_(var5[0], var5[1]);
               break;
            case 3:
               var4.class_(var5[0], var5[1], var5[2]);
               break;
            case 4:
               var4.class_(var5[0], var5[1], var5[2], var5[3]);
         }
      }
   }

   private void break_() {
      this.catch_ = rjV_2.class_((float)this.class_.class_, (float)this.class_.break_, 0.1F, 1000.0F);
   }
}
