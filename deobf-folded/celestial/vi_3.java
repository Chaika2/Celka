package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.hash.Hashing;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Date;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

public final class vi_3 extends Lg_1<vi_3> implements AutoCloseable {
   private final QY id_break;
   private final Fr_1 id_byte;
   final rrGm_1 id_protected;
   private final rqO_2 id_throws;
   private File id_case;
   private final fk_3 id_catch;
   private long id_private;

   public void id_byte() {
      String var1 = this.id_protected.id_class();

      try {
         rrGk_1 var2 = this.id_break.M().id_byte(var1);
         this.id_break.id_break(new ZA(var3x -> {
            try {
               var2.close();
            } catch (IOException var5) {
               va_3.id_throws.error("Failed to unlock level {}", var1, var5);
            }

            if (var3x) {
               this.id_class.id_class(() -> this.id_byte.id_throws.id_private(), true);
            }

            this.id_break.id_break(this.id_byte);
         }, var2));
      } catch (IOException var3) {
         va_3.id_throws.error("Failed to access level {}", var1, var3);
         this.id_class.id_class(() -> this.id_byte.id_throws.id_private(), true);
      }
   }

   public vi_3(va_3 var1, va_3 var2, rrGm_1 var3) {
      this.id_class = var1;
      this.id_byte = var2.id_implements();
      this.id_protected = var3;
      this.id_break = QY.id_instanceof();
      String var4 = var3.id_class();
      this.id_throws = new rqO_2("minecraft", "worlds/" + rqR_2.id_class(var4, rqO_2::id_break) + "/" + Hashing.sha1().hashUnencodedChars(var4) + "/icon");
      this.id_case = var3.id_byte();
      if (!this.id_case.isFile()) {
         this.id_case = null;
      }

      this.id_catch = this.id_catch();
   }

   public void id_class() {
      if (!this.id_protected.id_final()) {
         if (this.id_protected.id_volatile()) {
            rgn_3 var1 = new rgn_3("selectWorld.backupQuestion");
            rgn_3 var2 = new rgn_3("selectWorld.backupWarning", this.id_protected.id_implements(), rqu_3.id_class().getName());
            this.id_break.id_break(new my_3(this.id_byte, (var1x, var2x) -> {
               if (var1x) {
                  String var3 = this.id_protected.id_class();

                  try (rrGk_1 var4 = this.id_break.M().id_byte(var3)) {
                     ZA.id_class(var4);
                  } catch (IOException var9) {
                     va_3.id_throws.error("Failed to backup level {}", var3, var9);
                  }
               }

               this.id_throws();
            }, var1, var2, false));
         } else if (this.id_protected.id_native()) {
            this.id_break
               .id_break(
                  new mT_2(
                     var1x -> {
                        if (var1x) {
                           try {
                              this.id_throws();
                           } catch (Exception var3) {
                              va_3.id_throws.error("Failure to open 'future world'", var3);
                              this.id_break
                                 .id_break(
                                    new mQ_2(
                                       () -> this.id_break.id_break(this.id_byte),
                                       new rgn_3("selectWorld.futureworld.error.title"),
                                       new rgn_3("selectWorld.futureworld.error.text")
                                    )
                                 );
                           }
                        } else {
                           this.id_break.id_break(this.id_byte);
                        }
                     },
                     new rgn_3("selectWorld.versionQuestion"),
                     new rgn_3("selectWorld.versionWarning", this.id_protected.id_implements(), new rgn_3("selectWorld.versionJoinButton"), cN_2.id_protected)
                  )
               );
         } else {
            this.id_throws();
         }
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      String var11 = this.id_protected.id_break();
      String var12 = this.id_protected.id_class() + " (" + va_3.id_case.format(new Date(this.id_protected.id_throws())) + ")";
      if (StringUtils.isEmpty(var11)) {
         var11 = jI_2.id_class("selectWorld.world") + " " + (var2 + 1);
      }

      rgP_2 var13 = this.id_protected.id_package();
      ((cm_3)this.id_break.id_class[15]).id_break(var1, var11, (float)(var4 + 32 + 3), (float)(var3 + 1), 16777215);
      ((cm_3)this.id_break.id_class[15]).id_break(var1, var12, (float)(var4 + 32 + 3), (float)(var3 + 9 + 3), 8421504);
      ((cm_3)this.id_break.id_class[15]).id_byte(var1, var13, (float)(var4 + 32 + 3), (float)(var3 + 9 + 9 + 3), 8421504);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.id_break.A().id_class(this.id_catch != null ? this.id_throws : va_3.id_catch);
      RenderSystem.enableBlend();
      ch_3.id_class(var1, var4, var3, 0.0F, 0.0F, 32, 32, 32, 32);
      RenderSystem.disableBlend();
      if (((Qw_1)this.id_break.id_class[20]).S || var9) {
         this.id_break.A().id_class(va_3.id_class);
         ch_3.id_class(var1, var4, var3, var4 + 32, var3 + 32, -1601138544);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         int var14 = var7 - var4;
         boolean var15 = var14 < 32;
         int var16 = var15 ? 32 : 0;
         if (this.id_protected.id_final()) {
            ch_3.id_class(var1, var4, var3, 96.0F, (float)var16, 32, 32, 256, 256);
            if (var15) {
               this.id_byte.id_break(((cm_3)this.id_break.id_class[15]).id_break(va_3.id_return, 175));
            }
         } else if (this.id_protected.id_extends()) {
            ch_3.id_class(var1, var4, var3, 32.0F, (float)var16, 32, 32, 256, 256);
            if (this.id_protected.id_native()) {
               ch_3.id_class(var1, var4, var3, 96.0F, (float)var16, 32, 32, 256, 256);
               if (var15) {
                  this.id_byte.id_break(ImmutableList.of(va_3.id_private.id_catch(), va_3.id_implements.id_catch()));
               }
            } else if (!rqu_3.id_class().isStable()) {
               ch_3.id_class(var1, var4, var3, 64.0F, (float)var16, 32, 32, 256, 256);
               if (var15) {
                  this.id_byte.id_break(ImmutableList.of(va_3.id_finally.id_catch(), va_3.id_extends.id_catch()));
               }
            }
         } else {
            ch_3.id_class(var1, var4, var3, 0.0F, (float)var16, 32, 32, 256, 256);
         }
      }
   }

   @Override
   public void close() {
      if (this.id_catch != null) {
         this.id_catch.close();
      }
   }

   public void id_break() {
      this.id_break
         .id_break(
            new mT_2(
               var1 -> {
                  if (var1) {
                     this.id_break.id_break(new vY_2());
                     rrGd_1 var2 = this.id_break.M();
                     String var3 = this.id_protected.id_class();

                     try (rrGk_1 var4 = var2.id_byte(var3)) {
                        var4.id_catch();
                     } catch (IOException var9) {
                        va_3.id_throws.error("Failed to delete world {}", var3, var9);
                     }

                     this.id_class.id_class(() -> this.id_byte.id_throws.id_private(), true);
                  }

                  this.id_break.id_break(this.id_byte);
               },
               new rgn_3("selectWorld.deleteQuestion"),
               new rgn_3("selectWorld.deleteWarning", this.id_protected.id_break()),
               new rgn_3("selectWorld.deleteButton"),
               cN_2.id_protected
            )
         );
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      if (this.id_protected.id_final()) {
         return true;
      } else {
         this.id_class.id_class(this);
         this.id_byte.id_byte(this.id_class.id_private().isPresent());
         if (var1 - (double)this.id_class.id_continue() <= 32.0) {
            this.id_class();
            return true;
         } else if (rqR_2.id_break() - this.id_private < 250L) {
            this.id_class();
            return true;
         } else {
            this.id_private = rqR_2.id_break();
            return false;
         }
      }
   }

   private void id_throws() {
      this.id_break.c().id_class(Np_1.id_class(rqn_3.dw, 1.0F));
      if (this.id_break.M().id_break(this.id_protected.id_class())) {
         this.id_case();
         this.id_break.id_break(this.id_protected.id_class());
      }
   }

   private fk_3 id_catch() {
      boolean var1 = this.id_case != null && this.id_case.isFile();
      if (var1) {
         try {
            fk_3 var5;
            try (FileInputStream var2 = new FileInputStream(this.id_case)) {
               fN_2 var3 = fN_2.id_class(var2);
               Validate.validState(var3.id_class() == 64, "Must be 64 pixels wide", new Object[0]);
               Validate.validState(var3.id_break() == 64, "Must be 64 pixels high", new Object[0]);
               fk_3 var4 = new fk_3(var3);
               this.id_break.A().id_class(this.id_throws, var4);
               var5 = var4;
            }

            return var5;
         } catch (Throwable var8) {
            va_3.id_throws.error("Invalid icon for world {}", this.id_protected.id_class(), var8);
            this.id_case = null;
            return null;
         }
      } else {
         this.id_break.A().id_byte(this.id_throws);
         return null;
      }
   }

   private void id_case() {
      this.id_break.id_class(new ZE(new rgn_3("selectWorld.data_read")));
   }

   public void id_protected() {
      this.id_case();
      rVv_1 var1 = rVm_1.id_break();

      try (
         rrGk_1 var2 = this.id_break.M().id_byte(this.id_protected.id_class());
         QK var3 = this.id_break.id_class(var1, QY::id_class, QY::id_class, false, var2);
      ) {
         rYE var4 = var3.id_byte().id_throw();
         rTH var5 = var4.id_catch();
         rrSp_1 var6 = var3.id_byte().id_long();
         Path var7 = mo_3.id_class(var2.id_class(rrGr_1.id_catch), this.id_break);
         if (var6.id_implements()) {
            this.id_break
               .id_break(
                  new mT_2(
                     var6x -> this.id_break.id_break((vm_3)(var6x ? new mo_3(this.id_byte, var4, var6, var7, var5, var1) : this.id_byte)),
                     new rgn_3("selectWorld.recreate.customized.title"),
                     new rgn_3("selectWorld.recreate.customized.text"),
                     cN_2.id_catch,
                     cN_2.id_protected
                  )
               );
         } else {
            this.id_break.id_break(new mo_3(this.id_byte, var4, var6, var7, var5, var1));
         }
      } catch (Exception var12) {
         va_3.id_throws.error("Unable to recreate world", var12);
         this.id_break
            .id_break(
               new mQ_2(() -> this.id_break.id_break(this.id_byte), new rgn_3("selectWorld.recreate.error.title"), new rgn_3("selectWorld.recreate.error.text"))
            );
      }
   }
}
