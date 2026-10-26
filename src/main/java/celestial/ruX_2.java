/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.MarkerManager
 */
package celestial;

import celestial.ruS_2;
import celestial.rud_3;
import celestial.rum_3;
import celestial.ruq_3;
import celestial.ruu_3;
import celestial.ruv_3;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class ruX_2
extends MessageToByteEncoder<ruS_2<?>> {
    private static final Logger id_class = LogManager.getLogger();
    private static final Marker id_break = MarkerManager.getMarker((String)"PACKET_SENT", (Marker)rud_3.id_break);
    private final rum_3 id_byte;

    public ruX_2(rum_3 rum_32) {
        this.id_byte = rum_32;
    }

    protected /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) throws Exception {
        this.id_class(channelHandlerContext, (ruS_2)object, byteBuf);
    }

    protected void id_class(ChannelHandlerContext channelHandlerContext, ruS_2<?> ruS_22, ByteBuf byteBuf) throws Exception {
        ruv_3 ruv_32 = (ruv_3)((Object)channelHandlerContext.channel().attr(rud_3.id_byte).get());
        if (ruv_32 == null) {
            throw new RuntimeException("ConnectionProtocol unknown: " + ruS_22);
        }
        Integer n = ruv_32.id_class(this.id_byte, ruS_22);
        if (id_class.isDebugEnabled()) {
            id_class.debug(id_break, "OUT: [{}:{}] {}", channelHandlerContext.channel().attr(rud_3.id_byte).get(), (Object)n, (Object)ruS_22.getClass().getName());
        }
        if (n == null) {
            throw new IOException("Can't serialize unregistered packet");
        }
        ruu_3 ruu_32 = new ruu_3(byteBuf);
        ruu_32.id_protected(n);
        try {
            ruS_22.id_break(ruu_32);
        }
        catch (Throwable throwable) {
            id_class.error((Object)throwable);
            if (ruS_22.id_class()) {
                throw new ruq_3(throwable);
            }
            throw throwable;
        }
    }
}

