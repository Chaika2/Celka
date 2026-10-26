package celestial;

import java.net.InetAddress;
import java.net.UnknownHostException;

class mw_3 extends Thread {
   mw_3(mt_3 var1, String var2, String var3, int var4) {
      super(var2);
      this.byte_ = var1;
      this.class_ = var3;
      this.break_ = var4;
   }

   @Override
   public void run() {
      InetAddress var1 = null;

      try {
         if (this.byte_.catch_) {
            return;
         }

         var1 = InetAddress.getByName(this.class_);
         this.byte_.case_ = rud_3.class_(var1, this.break_, ((Qw_1)this.byte_.volatile_.class_[20]).case_());
         this.byte_.case_.class_(new Al_1(this.byte_.case_, this.byte_.volatile_, this.byte_.private_, var1x -> this.byte_.break_(var1x)));
         this.byte_.case_.class_(new rmJ_2(this.class_, this.break_, ruv_3.LOGIN));
         this.byte_.case_.class_(new rmu_3(this.byte_.volatile_.while_().throws_()));
         rrFK.class_((rrFD)rrFD.staticFields1658baa549203f63991cdcef51acf497[0], rgP_2.byte_(""), this.byte_.case_);
      } catch (UnknownHostException var4) {
         if (this.byte_.catch_) {
            return;
         }

         mt_3.throws_.error("Couldn't connect to server", var4);
         this.byte_
            .volatile_
            .execute(() -> this.byte_.volatile_.break_(new ZG(this.byte_.private_, cN_2.implements_, new rgn_3("disconnect.genericReason", "Unknown host"))));
      } catch (Exception var5) {
         if (this.byte_.catch_) {
            return;
         }

         mt_3.throws_.error("Couldn't connect to server", var5);
         String var3 = var1 == null ? var5.toString() : var5.toString().replaceAll(var1 + ":" + this.break_, "");
         this.byte_
            .volatile_
            .execute(() -> this.byte_.volatile_.break_(new ZG(this.byte_.private_, cN_2.implements_, new rgn_3("disconnect.genericReason", var3))));
      }
   }
}
