const mongoose = require('mongoose')
const uri = 'mongodb+srv://tfkhdyt:nUHdEN53s7EUt25j@cluster0.pbe5r.mongodb.net/taufik?retryWrites=true&w=majority' || 'mongodb://127.0.0.1:27017/taufik'
mongoose.connect(uri, {
  useNewUrlParser: true, 
  useUnifiedTopology: true,
  useCreateIndex: true
})
.then(() => console.log('MongoDB connected...'))
.catch(err => console.log(err));
