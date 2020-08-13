<template>
  <div>
    <div id="div1">
     <img src="../assets/return1.png" alt=""><div id="div1_1">滴哩集市</div>
    </div>
    <div id="div2">
      <img src="../assets/yifu.jpg">
      <div id="div2_1">2/5</div>
    </div>
    <div id="div3">
      <div id="div3_1">
        <div id="div3_1_1">￥</div>
        <div>{{product.price}}</div>
      </div>
      <div id="div3_2">
        <div  id="div3_2_1">
          <div>{{product.productname}}{{product.weight}}</div>
          <div>
            <input id="input1" type="text" value="明日达">
          </div>
        </div>
        <div id="div3_2_2">
          <div><img src="../assets/share.png" alt=""></div>
          <div>分享</div>
        </div>
      </div>
    </div>
    <div id="div4">
      <div>配送&nbsp;&nbsp;&nbsp;&nbsp;  现在下单，预计{{this.dateTime}}送达</div><hr />
      <div>限购&nbsp;&nbsp;&nbsp;&nbsp;  每人每天限购{{product.limitcount}}份</div><hr />
      <div>库存&nbsp;&nbsp;&nbsp;&nbsp;  剩余{{product.quantity}}件</div><hr />
      <div><img src="../assets/duihao.png" alt="">明日达</div>
    </div>
    <div class="distance"> </div>
    <div  id="div5" @click="evaluation">
      <div id="div5_1">
        <div id="div5_1_1">商品评价(1)</div>
        <div id="div5_1_2">好评度100%&nbsp;></div>
      </div>
      <div id="div5_2">
        <div id="div5_2_1">
          <img src="../assets/photo.png" alt="">
        </div>
        <div id="div5_2_2">
          <div>雷霆嘎巴</div>
          <div>
            <img src="../assets/star.png" alt="">
            <img src="../assets/star.png" alt="">
            <img src="../assets/star.png" alt="">
            <img src="../assets/star.png" alt="">
            <img src="../assets/star.png" alt="">
          </div>
        </div>
        <div id="div5_2_3">2020-08-10 18:19:32</div>
      </div>
      <div id="div5_3">
        <div id="div5_3_1">此用户未填写评价内容</div>
        <button type="button">查看全部评论</button>
      </div>
    </div>
    <div class="distance"> </div>
    <div id="div6">
      <div>商品详情</div>
      <img :src="product.pimg" alt="">
    </div>
    <div id="div7">
      <div id="div7_1">
        <img src="../assets/zhuye.png" alt="">
        <p>回首页</p>
      </div>
      <div  id="div7_2">
        <img src="../assets/gouwuche.png" alt="">
        <p>购物车</p>
      </div>
      <div id="div7_3">
        <button type="button" id="btn1">加入购物车</button>
        <button type="button" id="btn2">立即购买</button>
      </div>
    </div>
  </div>
</template>

<script>
  import axios from 'axios'
  export default {
    name:'productdetails',
    data(){
      return{
        productid:1,
        product:'',
        userid:'',
        dateTime:new Date()
      }
    },
    methods:{
      evaluation(){
        this.$router.push("evaluation?"+this.productid)
      }
    },
    created() {
      var userid = this.$route.query.userid;
      /* this.timer = setInterval(()=>{
        this.dateTime = new Date();
      },1000) */
      let date = {
        year:this.dateTime.getFullYear(),
        month:this.dateTime.getMonth()+1,
        date:this.dateTime.getDate()+1
      }
      this.dateTime = date.year+'-'+(date.month>9?date.month:"0"+date.month) + '-' + (date.date>9?date.date:"0"+date.date)

      axios
        .post("http://localhost:8095/DiliFresh/selectProductInfo/"+this.productid)
        .then(res => {
          console.log(res.data);
           this.product=res.data;

        });
    }
  }
</script>


<style scoped="scoped">
#div1{
  background-color: white;
  width: 100%;
  height: 80px;
  line-height: 80px;
  position: fixed ;
  top: 0px;
  font-size: 30px;
  text-align: center;
  font-weight: bold;
}
#div1 img{
  position: absolute;
  left: 10px;
  top: 30px;
}
#div2 img{
  width: 100%;
  margin-top: 80px;
  position: relative;
  z-index: -1;
}
#div2_1{
  font-size: 30px;
  width: 60px;
  height: 40px;
  text-align: center;
  background-color: black;
  color: white;
  opacity: 80%;
  border-radius: 10px;
  position: relative;
  left: 580px;
  bottom:60px;
  z-index: 1;
}
#div3_1{
  margin-top: -40px;
  display: flex;
  font-size: 40px;
  color: #FF313E;
}
#div3_1_1{
  font-size: 20px;
  margin-top: 20px;
  margin-left: 20px;
}
#div3_2{
  margin-top: 10px;
  margin-left: 20px;
  display: flex;
}
#div3_2_1 div{
  font-size: 30px;
  font-weight: bold;
}
#input1{
  width: 60px;
  text-align: center;
  font-size: 20px;
  border: 1px solid #FF313E;
  border-inline: none;
  color: #FF313E;
}
#div3_2_2{
  margin-top: 10px;
  position: absolute;
  right: -300px;
  text-align: center;
}
#div4 div{
  margin-left: 20px;
  margin-top: 25px;
  font-size: 25px;
  margin-bottom: 25px;
}
hr{
  border: 2px solid #F8F8F8;
}
#div4 div img{
  width: 25px;
  height: 25px;
  vertical-align: middle;
}
.distance{
  height: 20px;
  background-color: #F8F8F8;
}
#div5{
  margin-left:20px;
  margin-top: 20px;
  margin-bottom: 20px;
}
#div5_1{
  display: flex;
}
#div5_1 div{
  flex: 1;
}
#div5_1_1{
  font-size: 30px;
  font-weight: bold;
}
#div5_1_2{
  height: 50px;
  line-height: 50px;
  font-size: 25px;
  text-align: right;
  margin-right: 20px;
}
#div5_2{
  display: flex;
}
#div5_2_1 img{
  width: 80px;
  height: 80px;
}
#div5_2_2 div{
  margin-left: 10px;
  font-size: 20px;
  margin-top: 8px;
  align-items: center;
}
#div5_2_2 div img{
  width: 35px;
  height: 35px;
}
#div5_2_3{
  margin-top: 5px;
  margin-left: 85px;
  font-size: 25px;
  color: lightgray;
}
#div5_3{
  text-align: center;
}
#div5_3 div{
  margin-top: 20px;
  margin-left: 90px;
  text-align: left;
  font-size: 25px;
}
#div5 button{
  margin-top: 20px;
  width: 300px;
  height: 50px;
  border-radius: 30px;
  border: 1px solid lightgray;
  background-color: white;
  font-size: 25px;
  color: #464646;
  outline: none;
}
#div6 div{
  margin: 20px;
  font-size: 35px;
}
#div6 img{
  width: 100%;
  margin-bottom: 150px;
}
#div7{
  background-color: white;
  width: 100%;
  height: 120px;
  display: flex;
  font-size: 20px;
  align-items: center;
  position: fixed;
  bottom: 0px;
}
#div7 img{
  width: 60px;
  height: 60px;
}
#div7 div{
  margin-left: 40px;
}
#div7 p{
  margin: 0px;
  text-align: center;
}
#btn1{
  width: 200px;
  height: 80px;
  border: none;
  outline: none;
  border-inline: none;
  background-color: #FE5C79;
  border-top-left-radius: 40px;
  border-bottom-left-radius: 40px;
  color: white;
  font-size: 25px;
}
#btn2{
  margin-left: -7px;
  width: 200px;
  height: 80px;
  border: none;
  outline: none;
  background-color: #FE3D55;
  border-top-right-radius: 40px;
  border-bottom-right-radius: 40px;
  color: white;
  font-size: 25px;
}
</style>
