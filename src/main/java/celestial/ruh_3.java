/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.MarkerManager
 */
package celestial;

import celestial.ruS_2;
import celestial.rud_3;
import celestial.rum_3;
import celestial.ruu_3;
import celestial.ruv_3;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class ruh_3
extends ByteToMessageDecoder {
    private static final Logger id_class = LogManager.getLogger();
    private static final Marker id_break = MarkerManager.getMarker((String)"PACKET_RECEIVED", (Marker)rud_3.id_break);
    private final rum_3 id_byte;

    public ruh_3(rum_3 rum_32) {
        this.id_byte = rum_32;
    }

    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        if (byteBuf.readableBytes() != 0) {
            ruu_3 ruu_32 = new ruu_3(byteBuf);
            int n = ruu_32.id_case();
            ruS_2<?> ruS_22 = ((ruv_3)((Object)channelHandlerContext.channel().attr(rud_3.id_byte).get())).id_class(this.id_byte, n);
            if (ruS_22 == null) {
                throw new IOException("Bad packet id " + n);
            }
            ruS_22.id_class(ruu_32);
            if (ruu_32.readableBytes() > 0) {
                throw new IOException("Packet " + ((ruv_3)((Object)channelHandlerContext.channel().attr(rud_3.id_byte).get())).id_class() + "/" + n + " (" + ruS_22.getClass().getSimpleName() + ") was larger than I expected, found " + ruu_32.readableBytes() + " bytes extra whilst reading packet " + n);
            }
            list.add(ruS_22);
            if (id_class.isDebugEnabled()) {
                id_class.debug(id_break, " IN: [{}:{}] {}", channelHandlerContext.channel().attr(rud_3.id_byte).get(), (Object)n, (Object)ruS_22.getClass().getName());
            }
        }
    }
}

