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
   private final QY break_;
   private final Fr_1 byte_;
   final rrGm_1 protected_;
   private final rqO_2 throws_;
   private File case_;
   private final fk_3 catch_;
   private long private_;

   public void byte_() {
      String var1 = this.protected_.class_();

      try {
         rrGk_1 var2 = this.break_.M().byte_(var1);
         this.break_.break_(new ZA(var3x -> {
            try {
               var2.close();
            } catch (IOException var5) {
               va_3.throws_.error("Failed to unlock level {}", var1, var5);
            }

            if (var3x) {
               this.class_.class_(() -> this.byte_.throws_.private_(), true);
            }

            this.break_.break_(this.byte_);
         }, var2));
      } catch (IOException var3) {
         va_3.throws_.error("Failed to access level {}", var1, var3);
         this.class_.class_(() -> this.byte_.throws_.private_(), true);
      }
   }

   public vi_3(va_3 var1, va_3 var2, rrGm_1 var3) {
      this.class_ = var1;
      this.byte_ = var2.implements_();
      this.protected_ = var3;
      this.break_ = QY.instanceof_();
      String var4 = var3.class_();
      this.throws_ = new rqO_2("minecraft", "worlds/" + rqR_2.class_(var4, rqO_2::break_) + "/" + Hashing.sha1().hashUnencodedChars(var4) + "/icon");
      this.case_ = var3.byte_();
      if (!this.case_.isFile()) {
         this.case_ = null;
      }

      this.catch_ = this.catch_();
   }

   public void class_() {
      if (!this.protected_.final_()) {
         if (this.protected_.volatile_()) {
            rgn_3 var1 = new rgn_3("selectWorld.backupQuestion");
            rgn_3 var2 = new rgn_3("selectWorld.backupWarning", this.protected_.implements_(), rqu_3.class_().getName());
            this.break_.break_(new my_3(this.byte_, (var1x, var2x) -> {
               if (var1x) {
                  String var3 = this.protected_.class_();

                  try (rrGk_1 var4 = this.break_.M().byte_(var3)) {
                     ZA.class_(var4);
                  } catch (IOException var9) {
                     va_3.throws_.error("Failed to backup level {}", var3, var9);
                  }
               }

               this.throws_();
            }, var1, var2, false));
         } else if (this.protected_.native_()) {
            this.break_
               .break_(
                  new mT_2(
                     var1x -> {
                        if (var1x) {
                           try {
                              this.throws_();
                           } catch (Exception var3) {
                              va_3.throws_.error("Failure to open 'future world'", var3);
                              this.break_
                                 .break_(
                                    new mQ_2(
                                       () -> this.break_.break_(this.byte_),
                                       new rgn_3("selectWorld.futureworld.error.title"),
                                       new rgn_3("selectWorld.futureworld.error.text")
                                    )
                                 );
                           }
                        } else {
                           this.break_.break_(this.byte_);
                        }
                     },
                     new rgn_3("selectWorld.versionQuestion"),
                     new rgn_3("selectWorld.versionWarning", this.protected_.implements_(), new rgn_3("selectWorld.versionJoinButton"), cN_2.protected_)
                  )
               );
         } else {
            this.throws_();
         }
      }
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      String var11 = this.protected_.break_();
      String var12 = this.protected_.class_() + " (" + va_3.case_.format(new Date(this.protected_.throws_())) + ")";
      if (StringUtils.isEmpty(var11)) {
         var11 = jI_2.class_("selectWorld.world") + " " + (var2 + 1);
      }

      rgP_2 var13 = this.protected_.package_();
      ((cm_3)this.break_.class_[15]).break_(var1, var11, (float)(var4 + 32 + 3), (float)(var3 + 1), 16777215);
      ((cm_3)this.break_.class_[15]).break_(var1, var12, (float)(var4 + 32 + 3), (float)(var3 + 9 + 3), 8421504);
      ((cm_3)this.break_.class_[15]).byte_(var1, var13, (float)(var4 + 32 + 3), (float)(var3 + 9 + 9 + 3), 8421504);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.break_.A().class_(this.catch_ != null ? this.throws_ : va_3.catch_);
      RenderSystem.enableBlend();
      ch_3.class_(var1, var4, var3, 0.0F, 0.0F, 32, 32, 32, 32);
      RenderSystem.disableBlend();
      if (((Qw_1)this.break_.class_[20]).S || var9) {
         this.break_.A().class_(va_3.class_);
         ch_3.class_(var1, var4, var3, var4 + 32, var3 + 32, -1601138544);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         int var14 = var7 - var4;
         boolean var15 = var14 < 32;
         int var16 = var15 ? 32 : 0;
         if (this.protected_.final_()) {
            ch_3.class_(var1, var4, var3, 96.0F, (float)var16, 32, 32, 256, 256);
            if (var15) {
               this.byte_.break_(((cm_3)this.break_.class_[15]).break_(va_3.return_, 175));
            }
         } else if (this.protected_.extends_()) {
            ch_3.class_(var1, var4, var3, 32.0F, (float)var16, 32, 32, 256, 256);
            if (this.protected_.native_()) {
               ch_3.class_(var1, var4, var3, 96.0F, (float)var16, 32, 32, 256, 256);
               if (var15) {
                  this.byte_.break_(ImmutableList.of(va_3.private_.catch_(), va_3.implements_.catch_()));
               }
            } else if (!rqu_3.class_().isStable()) {
               ch_3.class_(var1, var4, var3, 64.0F, (float)var16, 32, 32, 256, 256);
               if (var15) {
                  this.byte_.break_(ImmutableList.of(va_3.finally_.catch_(), va_3.extends_.catch_()));
               }
            }
         } else {
            ch_3.class_(var1, var4, var3, 0.0F, (float)var16, 32, 32, 256, 256);
         }
      }
   }

   @Override
   public void close() {
      if (this.catch_ != null) {
         this.catch_.close();
      }
   }

   public void break_() {
      this.break_
         .break_(
            new mT_2(
               var1 -> {
                  if (var1) {
                     this.break_.break_(new vY_2());
                     rrGd_1 var2 = this.break_.M();
                     String var3 = this.protected_.class_();

                     try (rrGk_1 var4 = var2.byte_(var3)) {
                        var4.catch_();
                     } catch (IOException var9) {
                        va_3.throws_.error("Failed to delete world {}", var3, var9);
                     }

                     this.class_.class_(() -> this.byte_.throws_.private_(), true);
                  }

                  this.break_.break_(this.byte_);
               },
               new rgn_3("selectWorld.deleteQuestion"),
               new rgn_3("selectWorld.deleteWarning", this.protected_.break_()),
               new rgn_3("selectWorld.deleteButton"),
               cN_2.protected_
            )
         );
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      if (this.protected_.final_()) {
         return true;
      } else {
         this.class_.class_(this);
         this.byte_.byte_(this.class_.private_().isPresent());
         if (var1 - (double)this.class_.continue_() <= 32.0) {
            this.class_();
            return true;
         } else if (rqR_2.break_() - this.private_ < 250L) {
            this.class_();
            return true;
         } else {
            this.private_ = rqR_2.break_();
            return false;
         }
      }
   }

   private void throws_() {
      this.break_.c().class_(Np_1.class_(rqn_3.dw, 1.0F));
      if (this.break_.M().break_(this.protected_.class_())) {
         this.case_();
         this.break_.break_(this.protected_.class_());
      }
   }

   private fk_3 catch_() {
      boolean var1 = this.case_ != null && this.case_.isFile();
      if (var1) {
         try {
            fk_3 var5;
            try (FileInputStream var2 = new FileInputStream(this.case_)) {
               fN_2 var3 = fN_2.class_(var2);
               Validate.validState(var3.class_() == 64, "Must be 64 pixels wide", new Object[0]);
               Validate.validState(var3.break_() == 64, "Must be 64 pixels high", new Object[0]);
               fk_3 var4 = new fk_3(var3);
               this.break_.A().class_(this.throws_, var4);
               var5 = var4;
            }

            return var5;
         } catch (Throwable var8) {
            va_3.throws_.error("Invalid icon for world {}", this.protected_.class_(), var8);
            this.case_ = null;
            return null;
         }
      } else {
         this.break_.A().byte_(this.throws_);
         return null;
      }
   }

   private void case_() {
      this.break_.class_(new ZE(new rgn_3("selectWorld.data_read")));
   }

   public void protected_() {
      this.case_();
      rVv_1 var1 = rVm_1.break_();

      try (
         rrGk_1 var2 = this.break_.M().byte_(this.protected_.class_());
         QK var3 = this.break_.class_(var1, QY::class_, QY::class_, false, var2);
      ) {
         rYE var4 = var3.byte_().throw_();
         rTH var5 = var4.catch_();
         rrSp_1 var6 = var3.byte_().long_();
         Path var7 = mo_3.class_(var2.class_(rrGr_1.catch_), this.break_);
         if (var6.implements_()) {
            this.break_
               .break_(
                  new mT_2(
                     var6x -> this.break_.break_((vm_3)(var6x ? new mo_3(this.byte_, var4, var6, var7, var5, var1) : this.byte_)),
                     new rgn_3("selectWorld.recreate.customized.title"),
                     new rgn_3("selectWorld.recreate.customized.text"),
                     cN_2.catch_,
                     cN_2.protected_
                  )
               );
         } else {
            this.break_.break_(new mo_3(this.byte_, var4, var6, var7, var5, var1));
         }
      } catch (Exception var12) {
         va_3.throws_.error("Unable to recreate world", var12);
         this.break_
            .break_(new mQ_2(() -> this.break_.break_(this.byte_), new rgn_3("selectWorld.recreate.error.title"), new rgn_3("selectWorld.recreate.error.text")));
      }
   }
}
